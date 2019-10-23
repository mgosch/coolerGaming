package coolerGaming;
import java.util.Date;

public class TarjetaDeCredito {

	private int numero;
	private float credito;
	private Date fechaExpiracion;
	private int codigoSeguridad;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
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
	
	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}
	
	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	
}
