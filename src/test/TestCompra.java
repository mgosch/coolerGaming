package test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import coolerGaming.Genero;
import coolerGaming.Juego;
import coolerGaming.TarjetaDeCredito;
import coolerGaming.UsuarioRegistrado;

public class TestCompra {

	public static void main(String[] args) throws ParseException {
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", "10/08/1983", "admin@admin,com", 42121212);
        
    	List<Genero> listGenero = new ArrayList<Genero>();
    	Genero gen1 = new Genero("Aventura");
    	Genero gen2 = new Genero("Estrategia");
    	listGenero.add(gen1);
    	listGenero.add(gen2);
    	
    	Juego juego = new Juego("Pubg", 1500, 20, "videojuego de batalla en línea multijugador masivo", 001, listGenero);    	
    	TarjetaDeCredito tC2 = new TarjetaDeCredito("4509790045234220", 1200, "23/09/2020", "383");
    	String mensajeSaldo = ur.comprarJuego(juego, tC2);
    	System.out.println(mensajeSaldo);
    	
    	TarjetaDeCredito tC = new TarjetaDeCredito("4509790045234220", 7824, "23/09/2020", "383");
    	String mensajeExitoso = ur.comprarJuego(juego, tC);
    	System.out.println(mensajeExitoso);
    	System.out.println("El saldo actual de la tarjeta es: $"+ tC.getCredito());
	}

}
