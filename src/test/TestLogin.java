package test;

import java.text.ParseException;
import coolerGaming.Login;
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
public class TestLogin {
    public static void main(String[] args) throws ParseException {
    	UsuarioRegistrado ur1 = new UsuarioRegistrado("Jose", "Perez", "usuario", "contrasena2", "10/12/1978", "m@gmail.com", 46324260);
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", "10/08/1983", "admin@admin,com", 42121212);
        Login log = new Login(ur);
        String mensajeExitoso = log.loguearse("Admin", "Admin");
    	System.out.println(mensajeExitoso);
        Login log1 = new Login(ur1);
        String mensajeFallido = log1.loguearse("Admin", "Admin");
    	System.out.println(mensajeFallido);
    }
}
