
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
        String mensaje = log.loguearse("Admin", "Admin");
    	System.out.println(mensaje);
    }
}
