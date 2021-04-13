package com.example.mensajes;

import org.springframework.data.repository.CrudRepository;

public interface Isaludadores extends CrudRepository<Saludadores, Integer>{
   Saludadores findByNombre(String nombre);
}
