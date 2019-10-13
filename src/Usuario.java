import java.text.SimpleDateFormat;

public class Usuario {

	public UsuarioRegistrado registrarse(String nombre, String apellido, String usuario, String contrasena, 
            String fechaNacimiento, String mail, int telefono) throws Exception {
		UsuarioRegistrado usuarioRegistrado =  new UsuarioRegistrado(nombre, apellido, usuario, contrasena, new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento), mail, telefono);
	 return usuarioRegistrado;
	}
}
