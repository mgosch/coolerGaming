package coolerGaming;
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

        public String loguearse(String usuario, String pass){
            return verificarUsuario(usuario, pass);          
        }
        
        public String verificarUsuario(String usuario, String pass){
            if (usuarioRegistrado.getUsuario().equals(usuario) && usuarioRegistrado.getContrasena().equals(pass)) {
                return "Usuario validado";
            } else {
                return "Acceso denegado";
            }
        }
	
}
