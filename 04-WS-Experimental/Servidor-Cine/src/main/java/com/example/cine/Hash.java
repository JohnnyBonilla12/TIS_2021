package com.example.cine;

import java.util.HashMap;

public class Hash {
    HashMap <Integer, Sala> map = new HashMap <Integer, Sala> ();
 
    public Hash(){
        map.put(1, new Sala(1,"Justice League",30,0));
        map.put(2, new Sala(2,"Raya and The Last Dragon", 25,0));
        map.put(3, new Sala(3,"Godzilla Vs Kong",35,0));
        map.put(4, new Sala(4, "La Monja", 30, 0));
    }

    public Sala getSala(int id){
        return map.get(id);
    }

    public void update(int x, Sala s){
        map.put(x,s);
    }
}
