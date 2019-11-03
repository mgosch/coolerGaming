package coolerGaming;

import test.Sistema;

public class Alquiler extends Transaccion{

	private int tiempoDeAlquiler;

	public Alquiler(TarjetaDeCredito tC, int tiempoJuego) {
		this.setTarjetaDeCredito(tC);
		this.setTiempoDeAlquiler(tiempoJuego);
	}

	public int getTiempoDeAlquiler() {
		return tiempoDeAlquiler;
	}
	
	public float getTotalTransaccion() {
		float total = 0;
		for (Juego juego : juegos) {
			float precio = (juego.getPrecio()*juego.getPorcentaje()/100)*tiempoDeAlquiler;
			total += precio;
		};
		return total;
	}

	public void setTiempoDeAlquiler(int tiempoDeAlquiler) {
		this.tiempoDeAlquiler = tiempoDeAlquiler;
	}
	
	public String verificarTarjeta(String numero, String codigoSeguridad, java.util.Date fechaExpiracion){
		Sistema sist = new Sistema();
	    if (!sist.isValidTarjeta(numero, codigoSeguridad, fechaExpiracion)) {
	    	return "Tarjeta invalida";
	    } else {
	    	return "Tarjeta valida";
	    }
	}
	
}
