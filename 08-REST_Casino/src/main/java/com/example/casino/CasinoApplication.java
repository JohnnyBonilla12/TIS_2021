package com.example.casino;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class CasinoApplication {
	ArrayList<Player> players =new ArrayList<>();
	
	public static void main(String[] args) {
		SpringApplication.run(CasinoApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/juego/entrar")
	public String create(@RequestParam(required = false, value="name")String name ){
		Player jugador= new Player(name,0);
		players.add(jugador);
		return "El jugador se ha unido: "+jugador.getNombre();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/juego/tablero")
	public String ver(){
		String allPlayers="";
		for(Player p: players){
			allPlayers+="Jugador: "+p.getNombre()+" Score: "+p.getScore()+"\n";
		}
		return allPlayers;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/juego/tirar")
	public String tirar(){
		int plus=players.size()+1;
		int casilla=(int) Math.floor(Math.random()*plus);  
		if(casilla==0){
			return "Nadie se mueve";
		}else{
			players.get(casilla-1).setScore(players.get(casilla-1).getScore()+1);
			if(players.get(casilla-1).getScore()==5){
				return "El jugador: "+players.get(casilla-1).getNombre()+" puede matar";
			}
			return "El jugador: "+players.get(casilla-1).getNombre()+" avanza: "+players.get(casilla-1).getScore();
		}		
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/juego/matar")
	public String matar(@RequestParam(required = true, value="name")String name ){
		String muertito="vacio",asesino="vacio";
		int index=100;
		for(Player p: players){
			if( p.getNombre().equals(name)){ 
				muertito=p.getNombre();
				// players.remove(players.indexOf(p));
				index=players.indexOf(p);
			}
		}
		for(Player p: players){
			if( p.getScore()==5){ 
				asesino=p.getNombre();
				p.setScore(0);	
			}
		}
		players.remove(index); 
		System.out.println(index);
		return asesino+ " ha matado a "+ muertito;		
	}
}
