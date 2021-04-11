package com.example.cine;

public class Reservacion {
    int idReservacion;
    String usuario;
    int sala;
    int lugaresReser;

    public Reservacion(){

    }

    public Reservacion(int idReservacion, String usuario, int sala, int lugaresReser) {
        this.idReservacion = idReservacion;
        this.usuario = usuario;
        this.sala = sala;
        this.lugaresReser = lugaresReser;
    }

    public int getIdReservacion(){
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion){
        this.idReservacion=idReservacion;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    public int getSala(){
        return sala;
    }

    public void setSala(int sala){
        this.sala=sala;
    }

    public int getLugaresReser(){
        return lugaresReser;
    }

    public void setLugaresReser(int lugaresReser){
        this.lugaresReser=lugaresReser;
    }
}




