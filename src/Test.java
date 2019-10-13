
import java.util.Date;

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
    public static void main(String[] args) {
        UsuarioRegistrado ur = new UsuarioRegistrado("Aldo", "Rico", "Admin", "Admin", null, "admin@admin,com", 42121212);
        
        Login log = new Login(ur);
        
        System.out.println(log.loguearse("Admin", "Admin"));
    }
}
