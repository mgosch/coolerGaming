package test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import coolerGaming.Genero;
import coolerGaming.Juego;
import coolerGaming.UsuarioRegistrado;

public class TestCalificacion {

	public static void main(String[] args) throws ParseException {
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", "10/08/1983", "admin@admin,com", 42121212);
    	UsuarioRegistrado ur1 = new UsuarioRegistrado("Jose", "Perez", "usuario", "contrasena2", "10/12/1978", "m@gmail.com", 46324260);
    	
    	List<Genero> listGenero = new ArrayList<Genero>();
    	Genero gen1 = new Genero("Aventura");
    	Genero gen2 = new Genero("Estrategia");
    	listGenero.add(gen1);
    	listGenero.add(gen2);
    	
    	Juego juego = new Juego("Pubg", 1500, 5, "videojuego de batalla en línea multijugador masivo", 001, listGenero); 

    	int Calificacion = ur.calificaJuego(juego, 10 , "Muy buen juego");
    	System.out.println(Calificacion);
    	int Calificacion2 =ur1.calificaJuego(juego, 8, "Esta bueno");
    	System.out.println(Calificacion2);
    	
	}

}
