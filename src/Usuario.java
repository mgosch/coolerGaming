import java.text.SimpleDateFormat;

public class Usuario {

	public UsuarioRegistrado registrarPadre(String nombre, String apellido, String usuario, String contrase�a, 
			String fechaNacimiento, String mail, int telefono) throws Exception {
		UsuarioRegistrado usuarioRegistrado = new UsuarioRegistrado();
		usuarioRegistrado.setNombre(nombre);
		usuarioRegistrado.setApellido(apellido);
		usuarioRegistrado.setUsuario(usuario);
		usuarioRegistrado.setContrase�a(contrase�a);
		usuarioRegistrado.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento));
		usuarioRegistrado.setMail(mail);
		usuarioRegistrado.setTelefono(telefono);
	 return usuarioRegistrado;
	}
}
