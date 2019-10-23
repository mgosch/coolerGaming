package test;


import java.util.ArrayList;
import java.util.List;

import coolerGaming.Calificacion;
import coolerGaming.Genero;
import coolerGaming.Juego;
import coolerGaming.Login;
import coolerGaming.Usuario;
import coolerGaming.UsuarioRegistrado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class Test {
    public static void main(String[] args) throws Exception {
    	Usuario u = new Usuario();
    	UsuarioRegistrado ur1 = u.registrarse("Jose", "Perez", "usuario", "contrasena2", "10/12/1978", "m@gmail.com", 4632-4260);
    	System.out.println("Se ha registrado con exito: " + ur1.getNombre());
    	
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", "10/08/1983", "admin@admin,com", 42121212);
        Login log = new Login(ur);
        String mensajeExitoso = log.loguearse("Admin", "Admin");
    	System.out.println(mensajeExitoso);
        Login log1 = new Login(ur1);
        String mensajeFallido = log1.loguearse("Admin", "Admin");
    	System.out.println(mensajeFallido);
    	
    	List<Calificacion> listCalificacion = new ArrayList();
    	Calificacion cal1 = new Calificacion("Esta muy bueno", 8, ur1);
    	Calificacion cal2 = new Calificacion("Genial", 10, ur);
    	listCalificacion.add(cal1);
    	listCalificacion.add(cal2);
    	
    	List<Genero> listGenero = new ArrayList();
    	Genero gen1 = new Genero("Aventura");
    	Genero gen2 = new Genero("Estrategia");
    	listGenero.add(gen1);
    	listGenero.add(gen2);
    	
    	Juego juego = new Juego("Pubg", 1500, 20, "videojuego de batalla en línea multijugador masivo", 001, listCalificacion, listGenero);
    	List<Juego> listJuego = ur.buscarJuego();
    	System.out.println(listJuego);
    }
}
