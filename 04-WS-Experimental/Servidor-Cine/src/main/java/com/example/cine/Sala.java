package com.example.cine;

public class Sala {
    int idP;
    String nombreP;
    int lugaresDisponibles;
    int lugaresOcupados;

    public Sala(){

    }

    public Sala(int idP, String nombreP, int lugaresDisponibles, int lugaresOcupados) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.lugaresDisponibles = lugaresDisponibles;
        this.lugaresOcupados = lugaresOcupados;
    }

    public void setIdp(int idP){
        this.idP=idP;
    }

    public int getIdP(){
        return idP;
    }

    public void setNombreP(String nombreP){
        this.nombreP=nombreP;
    }

    public String getNombreP(){
        return nombreP;
    }

    public void setLugaresDisponibles(int lugaresDisponibles){
        this.lugaresDisponibles=lugaresDisponibles;
    }

    public int getLugaresDisponibles(){
        return lugaresDisponibles;
    }

    public void setLugaresOcupados(int lugaresOcupados){
        this.lugaresOcupados=lugaresOcupados;
    }

    public int getLugaresOcupados(){
        return lugaresOcupados;
    }

    @Override
    public String toString() {
        String msj= "ID de la Sala: "+idP+ "\n Nombre de la pelicula: "+ nombreP+"\n Lugares Disponibles: "+lugaresDisponibles+ 
        "\n Lugares Ocupados: "+lugaresOcupados;
        return msj;
    }


}
