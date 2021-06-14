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
import cafeteria.pedidos.UpdateRequest;
import cafeteria.pedidos.UpdateResponse;

@Endpoint
public class ServerEndpoint {
    @Autowired
    private Interface_CRUD interface_crud;

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "CreatePedidoRequest")
    @ResponsePayload
    public CreatePedidoResponse crearPedido(@RequestPayload CreatePedidoRequest peticion){
        CreatePedidoResponse respuesta = new CreatePedidoResponse();
        Pedido pedido = new Pedido();
        Pedido pedido2 = new Pedido();

        pedido.setId_Carrito(peticion.getIdCarrito());
        pedido.setFecha(peticion.getFecha().toString());
        pedido.setCosto(peticion.getCosto().doubleValue());
        pedido.setStatus(peticion.getStatus());
        pedido.setDireccion(peticion.getDireccion());

        pedido2=interface_crud.save(pedido);
        respuesta.setMensaje("Pedido Agregado con éxito");
        respuesta.setIdPedidoCreado(pedido2.getId());
        // respuesta.setRespuesta(pedido.toString());
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
        respuesta.setMensaje("Pedido Eliminado con éxito");
        respuesta.setIdPedidoEliminado(local.get().getId());;
        
        return respuesta;
    }

    @PayloadRoot(namespace = "http://cafeteria/pedidos", localPart = "UpdateRequest")
    @ResponsePayload
    public UpdateResponse actualizarStatus(@RequestPayload UpdateRequest peticion){
        UpdateResponse respuesta=new UpdateResponse();
        Pedido pedido=new Pedido();
        try {
            pedido=interface_crud.findById(peticion.getId()).get();
            pedido.setStatus(peticion.getStatus());
            interface_crud.save(pedido);
            respuesta.setMensaje("Staus del pedido actualizado");
            respuesta.setIdPedidoActualizado(pedido.getId());
            return respuesta;
        } catch (Exception e) {
            respuesta.setMensaje("Error al modificar Status");
            respuesta.setIdPedidoActualizado(0);
            return respuesta;
        }
    }
}