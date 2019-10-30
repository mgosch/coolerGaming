package coolerGaming;

public class Alquiler extends Transaccion{

	private int tiempoDeAlquiler;

	public int getTiempoDeAlquiler() {
		return tiempoDeAlquiler;
	}
	
	public float getTotalTransaccion() {
		float total = 0;
		for (Juego juego : juegos) {
			total += juego.getPrecio();
		};
		return total;
	}

	public void setTiempoDeAlquiler(int tiempoDeAlquiler) {
		this.tiempoDeAlquiler = tiempoDeAlquiler;
	}
	
}
