package coolerGaming;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TarjetaDeCredito {

	private String numero;
	private float credito;
	private Date fechaExpiracion;
	private String codigoSeguridad;
	
	public TarjetaDeCredito(String numero, float credito, String fechaExpiracion, String codigoSeguridad) throws ParseException {
		this.setNumero(numero);
		this.setCredito(credito);
		this.setFechaExpiracion(new SimpleDateFormat("dd/MM/yyyy").parse(fechaExpiracion));
		this.setCodigoSeguridad(codigoSeguridad);
	}
	
	public TarjetaDeCredito() {
		
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getCredito() {
		return credito;
	}
	
	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	
}
