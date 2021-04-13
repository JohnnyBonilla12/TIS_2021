package com.example.mensajes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.mensajes.CreateRequest;
import me.tell.mensajes.CreateResponse;
import me.tell.mensajes.DeleteRequest;
import me.tell.mensajes.DeleteResponse;
import me.tell.mensajes.ReadAllRequest;
import me.tell.mensajes.ReadAllResponse;
import me.tell.mensajes.ReadByNombreRequest;
import me.tell.mensajes.ReadByNombreResponse;
import me.tell.mensajes.ReadRequest;
import me.tell.mensajes.ReadResponse;
import me.tell.mensajes.UpdateRequest;
import me.tell.mensajes.UpdateResponse;


@Endpoint
public class SaludadoresEndPoint {
    @Autowired
    private Isaludadores isaludadores;

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "CreateRequest")
    @ResponsePayload
    public CreateResponse crearUsuario(@RequestPayload CreateRequest peticion){
        CreateResponse respuesta = new CreateResponse();
        respuesta.setRespuesta("Hola, " + peticion.getNombre());
        Saludadores saludadores = new Saludadores();
        saludadores.setNombre(peticion.getNombre());
        isaludadores.save(saludadores);
        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "ReadAllRequest")
    @ResponsePayload
    public ReadAllResponse leerUsuarios(@RequestPayload ReadAllRequest peticion){
        ReadAllResponse respuesta = new ReadAllResponse();
        Iterable<Saludadores> listaSaludadores = isaludadores.findAll();

        for(Saludadores ls : listaSaludadores){
            ReadAllResponse.Saludador e = new ReadAllResponse.Saludador();
            e.setId(ls.getId());
            e.setNombre(ls.getNombre());
            respuesta.getSaludador().add(e);
        }

        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "ReadRequest")
    @ResponsePayload
    public ReadResponse obtenerUsuario(@RequestPayload ReadRequest peticion){
        ReadResponse respuesta = new ReadResponse();
        Optional<Saludadores> local;
        local = isaludadores.findById(peticion.getId());
        respuesta.setId(local.get().getId());
        respuesta.setNombre(local.get().getNombre());
        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "UpdateRequest")
    @ResponsePayload
    public UpdateResponse editarUsuario(@RequestPayload UpdateRequest peticion){
        UpdateResponse respuesta = new UpdateResponse();
        Optional<Saludadores> local;
        local = isaludadores.findById(peticion.getId());
        if(local.isPresent()){
            local.get().setNombre(peticion.getNombre());
            isaludadores.save(local.get());
            respuesta.setRespuesta("Usuario Modificado Correctamente " + local.get().toString().trim());
        }else{
            respuesta.setRespuesta("ERROR: ID inexistente.");
        }
        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "DeleteRequest")
    @ResponsePayload
    public DeleteResponse borrarUsuario(@RequestPayload DeleteRequest peticion){
        DeleteResponse respuesta = new DeleteResponse();
        Optional<Saludadores> local;
        local = isaludadores.findById(peticion.getId());
        isaludadores.deleteById(peticion.getId());
        respuesta.setRespuesta("Usuario Borrado Correctamente " + local.get().toString().trim());
        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "ReadByNombreRequest")
    @ResponsePayload
    public ReadByNombreResponse buscarXnombre(@RequestPayload ReadByNombreRequest peticion){
        ReadByNombreResponse respuesta = new ReadByNombreResponse();
        Saludadores local;
        local = isaludadores.findByNombre(peticion.getNombre());
        respuesta.setId(local.getId());
        respuesta.setNombre(local.getNombre());
        return respuesta;
    }
}