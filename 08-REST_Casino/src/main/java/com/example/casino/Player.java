package com.example.casino;

public class Player {
    String nombre;
    int score;

    public Player(String nombre, int score) {
        this.nombre = nombre;
        this.score = score;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setScore(int score){
        this.score=score;
    }

    public int getScore(){
        return score;
    }

    
}








