package coolerGaming;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	public List<Juego> buscarJuego() {
		List<Juego> listJuego = new ArrayList<Juego>();
		return listJuego;
		
	}
	
	public String getUsuarioRegistrado() {
		return this.getNombre() + ' ' + this.getApellido();
	}
	
	public String comprarJuego(Juego juego, TarjetaDeCredito tarjetaDeCredito) {
		Compra compra = new Compra(tarjetaDeCredito);
		String mensaje = compra.verificarTarjeta(tarjetaDeCredito.getNumero(), tarjetaDeCredito.getCodigoSeguridad(), tarjetaDeCredito.getFechaExpiracion());
		if (!mensaje.equals("Tarjeta Invalida")) {
			compra.getJuegos().add(juego);
			compra.setTotalTransaccion(juego.getPrecio());
			if (compra.getTotalTransaccion()> tarjetaDeCredito.getCredito()){
				mensaje = "Saldo insuficiente";
			} else {
				tarjetaDeCredito.setCredito(tarjetaDeCredito.getCredito()-compra.getTotalTransaccion());
			}
		}
		return mensaje;
	}
	
}
