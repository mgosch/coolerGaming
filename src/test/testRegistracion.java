package test;

import coolerGaming.Usuario;
import coolerGaming.UsuarioRegistrado;

public class testRegistracion {
    public static void main(String[] args) throws Exception {
    	Usuario u = new Usuario();
    	UsuarioRegistrado ur1 = u.registrarse("Jose", "Perez", "usuario", "contrasena2", "10/12/1978", "m@gmail.com", 4632-4260);
    	System.out.println("Se ha registrado con exito: " + ur1.getUsuarioRegistrado());
    }	
}
