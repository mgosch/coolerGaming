import java.util.Date;

public class Login {

	private Date fecha;
	private UsuarioRegistrado usuarioRegistrado;

    public Login(UsuarioRegistrado usuarioRegistrado) {
        this.usuarioRegistrado = usuarioRegistrado;
    }
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}
	
	public void setUsuarioRegistrado(UsuarioRegistrado usuarioRegistrado) {
		this.usuarioRegistrado = usuarioRegistrado;
	}

        public void loguearse(String usuario, String pass){
            verificarUsuario(usuario, pass);
        }
        
        public void verificarUsuario(String usuario, String pass){
            if (usuarioRegistrado.getUsuario().equals(usuario) && usuarioRegistrado.getContrasena().equals(pass)) {
                System.out.println("Usuario validado");
            } else {
                System.out.println("Acceso denegado");
            }
        }
	
}
