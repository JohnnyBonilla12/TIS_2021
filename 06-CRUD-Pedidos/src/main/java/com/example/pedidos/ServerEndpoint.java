package com.example.pedidos;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import cafeteria.pedidos.CreatePedidoRequest;
import cafeteria.pedidos.CreatePedidoResponse;
import cafeteria.pedidos.DeleteRequest;
import cafeteria.pedidos.DeleteResponse;
import cafeteria.pedidos.ReadAllRequest;
import cafeteria.pedidos.ReadAllResponse;
import cafeteria.pedidos.ReadRequest;
import cafeteria.pedidos.ReadResponse;

@Endpoint
public class ServerEndpoint {
    @Autowired
    private Interface_CRUD interface_crud;

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "CreatePedidoRequest")
    @ResponsePayload
    public CreatePedidoResponse crearPedido(@RequestPayload CreatePedidoRequest peticion){
        CreatePedidoResponse respuesta = new CreatePedidoResponse();
        Pedido pedido = new Pedido();

        pedido.setId_Carrito(peticion.getIdCarrito());
        pedido.setFecha(peticion.getFecha().toString());
        pedido.setCosto(peticion.getCosto().doubleValue());
        pedido.setStatus(peticion.getStatus());
        pedido.setDireccion(peticion.getDireccion());

        interface_crud.save(pedido);

        respuesta.setRespuesta(pedido.toString());
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "ReadAllRequest")
    @ResponsePayload
    public ReadAllResponse leerPedidos(@RequestPayload ReadAllRequest peticion){
        ReadAllResponse respuesta = new ReadAllResponse();
        Iterable<Pedido> lista_Pedidos = interface_crud.findAll();

        for(Pedido ls : lista_Pedidos){
            ReadAllResponse.Pedido p = new ReadAllResponse.Pedido();
            p.setId(ls.getId());
            p.setIdCarrito(ls.getId_Carrito());
            p.setFecha(ls.getFecha());
            p.setCosto(BigDecimal.valueOf(ls.getCosto()));
            p.setStatus(ls.getStatus());
            p.setDireccion(ls.getDireccion());
            
            respuesta.getPedido().add(p);
        }
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "ReadRequest")
    @ResponsePayload
    public ReadResponse obtenerPedido(@RequestPayload ReadRequest peticion){
        ReadResponse respuesta = new ReadResponse();
        Optional<Pedido> local;
        local = interface_crud.findById(peticion.getId());

        respuesta.setId(local.get().getId());
        respuesta.setIdCarrito(local.get().getId_Carrito());
        respuesta.setFecha(local.get().getFecha());
        respuesta.setCosto(BigDecimal.valueOf(local.get().getCosto()));
        respuesta.setStatus(local.get().getStatus());
        respuesta.setDireccion(local.get().getDireccion());
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "DeleteRequest")
    @ResponsePayload
    public DeleteResponse borrarUsuario(@RequestPayload DeleteRequest peticion){
        DeleteResponse respuesta = new DeleteResponse();
        Optional<Pedido> local;
        local = interface_crud.findById(peticion.getId());
        interface_crud.deleteById(peticion.getId());
        respuesta.setRespuesta("Pedido Borrado Correctamente " + local.get().toString());
        return respuesta;
    }
}