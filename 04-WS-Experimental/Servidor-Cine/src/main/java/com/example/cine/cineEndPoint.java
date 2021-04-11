package com.example.cine;

import java.util.HashMap;
import org.example.cine.PeliculaRequest;
import org.example.cine.PeliculaResponse;
import org.example.cine.ReservacionRequest;
import org.example.cine.ReservacionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class cineEndPoint {
    Hash datos=new Hash();
    Sala sala=new Sala();
    HashMap <Integer, Reservacion> reservaciones = new HashMap <Integer, Reservacion> ();

    @PayloadRoot (namespace="http://www.example.org/cine", localPart= "PeliculaRequest")
    @ResponsePayload
    public PeliculaResponse damePelicula(@RequestPayload PeliculaRequest peticion){
        PeliculaResponse respuesta= new PeliculaResponse();
        sala=datos.getSala(Integer.parseInt(peticion.getA()));
        respuesta.setIdPelicula(String.valueOf(sala.getIdP()));
        respuesta.setNombreP(sala.getNombreP());
        respuesta.setLugaresD(String.valueOf(sala.getLugaresDisponibles()));
        respuesta.setLugaresO(String.valueOf(sala.getLugaresOcupados()));
        return respuesta;
    }

    @PayloadRoot (namespace="http://www.example.org/cine", localPart= "ReservacionRequest")
    @ResponsePayload
    public ReservacionResponse dameReservacion(@RequestPayload ReservacionRequest peticion){
        ReservacionResponse respuesta= new ReservacionResponse();
        
        Reservacion reser=new Reservacion(reservaciones.size(),peticion.getUsuario(),
        Integer.parseInt(peticion.getSala()),Integer.parseInt(peticion.getLugaresR()));
        reservaciones.put(reser.getIdReservacion(), reser);
        sala=datos.getSala(reser.getSala());
        sala.setLugaresOcupados(sala.getLugaresOcupados()+reser.getLugaresReser());
        datos.update(sala.getIdP(), sala);
        respuesta.setReservacionID(String.valueOf("Reservacion con id: "+reser.getIdReservacion()));
        return respuesta;
    }
}
