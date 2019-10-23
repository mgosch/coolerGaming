package coolerGaming;
import java.text.ParseException;

public class Usuario {

	public UsuarioRegistrado registrarse(String nombre, String apellido, String usuario, String contrasena, 
            String fechaNacimiento, String mail, int telefono) throws ParseException{
		UsuarioRegistrado usuarioRegistrado =  new UsuarioRegistrado(nombre, apellido, usuario, contrasena, fechaNacimiento, mail, telefono);
	 return usuarioRegistrado;
	}
}
