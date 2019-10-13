import java.text.SimpleDateFormat;

public class Usuario {

	public UsuarioRegistrado registrarPadre(String nombre, String apellido, String usuario, String contrasena, 
            String fechaNacimiento, String mail, int telefono) throws Exception {
		UsuarioRegistrado usuarioRegistrado = new UsuarioRegistrado();
		usuarioRegistrado.setNombre(nombre);
		usuarioRegistrado.setApellido(apellido);
		usuarioRegistrado.setUsuario(usuario);
		usuarioRegistrado.setContrasena(contrasena);
		usuarioRegistrado.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento));
		usuarioRegistrado.setMail(mail);
		usuarioRegistrado.setTelefono(telefono);
	 return usuarioRegistrado;
	}
}
