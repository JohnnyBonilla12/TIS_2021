package com.example.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@RequestMapping("/")
	String home(){
		return "<h1>Bienvenido</h1>";
	}

	@RequestMapping("/hola")
	String hola(){
		return "<h2>¡Hola Mundo! :D</h2>";
	}

	@PostMapping("/hola")
	String hola_post(){
		return "<h2>Hola Mundo POST</h2>";
	}

	@RequestMapping("/adios")
	String adios(){
		return "<h2>Adios Mundo :C</h2>";
	}

	@RequestMapping("/json")
	String json(){
		return "{ 'contenido': 'valor'}";
	}

	@RequestMapping("/saludar")
	public String saludar(@RequestParam(defaultValue = "Primavera", required = false,
	value = "apodo") String nombre){
		return "Hola, " + nombre;
	}

	@RequestMapping("/saludar/{nombre}")
	public String saludarte(@PathVariable String nombre){
		return "Hola, " + nombre;
	}

	@RequestMapping("/saludarles")
	//http://localhost:8080/saludarles?nombre=otono&nombre=invierno&nombre=primavera
	public List<String> saludarles(@RequestParam(value = "nombre") List<String> nombres){
		List<String> respuesta = new ArrayList<String>();
		int i = 0;
		for(String nombre: nombres){
			respuesta.add(nombre);
			i++;
		}
		return respuesta;
	}

	@PostMapping("saludar/json")
	public String json(@RequestParam Map<String, String> parametros){
		return "parametros " + parametros.entrySet();
	}
}
