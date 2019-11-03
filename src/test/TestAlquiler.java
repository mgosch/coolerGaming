package test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import coolerGaming.Genero;
import coolerGaming.Juego;
import coolerGaming.TarjetaDeCredito;
import coolerGaming.UsuarioRegistrado;

public class TestAlquiler {

	public static void main(String[] args) throws ParseException {
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", "10/08/1983", "admin@admin,com", 42121212);
        
    	List<Genero> listGenero = new ArrayList<Genero>();
    	Genero gen1 = new Genero("Aventura");
    	Genero gen2 = new Genero("Estrategia");
    	listGenero.add(gen1);
    	listGenero.add(gen2);
    	
    	Juego juego = new Juego("Pubg", 1500, 5, "videojuego de batalla en línea multijugador masivo", 001, listGenero); 
    	Juego juego2 = new Juego("Pacman", 800, 3, "videojuego retro", 002, listGenero); 
    	Juego juego3 = new Juego("Fortnite", 3000, 6, "videojuego de batalla", 003, listGenero); 
    	
    	TarjetaDeCredito tC2 = new TarjetaDeCredito("4509790045234220", 400, "23/09/2020", "383");
    	List<Juego> listJuego = new ArrayList<Juego>();
    	listJuego.add(juego);
    	
    	List<Juego> listJuego2 = new ArrayList<Juego>();
    	listJuego2.add(juego);
    	listJuego2.add(juego2);
    	listJuego2.add(juego3);
    	
    	int tiempo=2;
    	String mensajeSaldo = ur.alquilarJuego(listJuego2, tC2, tiempo);
    	System.out.println(mensajeSaldo);
    	
    	TarjetaDeCredito tC3 = new TarjetaDeCredito("4509810045234220", 7800, "23/09/2020", "383");
    	int tiempoJ=1;
    	String mensajeInvalido = ur.alquilarJuego(listJuego, tC3, tiempoJ);
    	System.out.println(mensajeInvalido);
    	
    	TarjetaDeCredito tC = new TarjetaDeCredito("4509790045234220", 7824, "23/09/2020", "383");
    	String mensajeExitoso = ur.alquilarJuego(listJuego2, tC, tiempoJ);
    	System.out.println(mensajeExitoso);
    	System.out.println("El saldo actual de la tarjeta es: $"+ tC.getCredito());
    	
	}

}
