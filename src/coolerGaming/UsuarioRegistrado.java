package coolerGaming;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UsuarioRegistrado {

	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private Date fechaNacimiento;
	private String mail;
	private int telefono;

    public UsuarioRegistrado(String nombre, String apellido, String usuario, String contrasena, String fechaNacimiento, String mail, int telefono) throws ParseException{
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setUsuario(usuario);
        this.setContrasena(contrasena);
        this.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento));
        this.setMail(mail);
        this.setTelefono(telefono);
    }

    UsuarioRegistrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getUsuarioRegistrado() {
		return this.getNombre() + ' ' + this.getApellido();
	}
	
	public String comprarJuego(List<Juego> listJuego, TarjetaDeCredito tC) {
		Compra compra = new Compra(tC);
		String mensaje = validaciones(listJuego, tC, compra);
		return mensaje;
	}

	public String alquilarJuego(List<Juego> listJuego, TarjetaDeCredito tC, int tiempoJuego) {
		Alquiler alquiler = new Alquiler(tC, tiempoJuego);
		String mensaje = validaciones(listJuego, tC, alquiler);
		return mensaje;
	}

	private String validaciones(List<Juego> listJuego, TarjetaDeCredito tC, Transaccion alquilerCompra) {
		String mensaje = alquilerCompra.verificarTarjeta(tC.getNumero(), tC.getCodigoSeguridad(), tC.getFechaExpiracion());
		if (mensaje.equals("Tarjeta valida")) {
			alquilerCompra.setJuegos(listJuego);
			if (alquilerCompra.getTotalTransaccion()> tC.getCredito()){
				mensaje = "Saldo insuficiente";
			} else {
				tC.setCredito(tC.getCredito()-alquilerCompra.getTotalTransaccion());
				mensaje = "Operación realizada. El valor del alquiler es $: "+  alquilerCompra.getTotalTransaccion() + ". Descargando juego ...";
			}
		}
		return mensaje;
	}

	public int calificaJuego(Juego juego, int puntaje, String comentario) {
		Calificacion cal = new Calificacion(comentario, puntaje, juego);
		return cal.getPuntaje();
	}
	
}
