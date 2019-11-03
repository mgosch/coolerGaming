package coolerGaming;

public class Compra extends Transaccion{

	private float descuento;

	public Compra(TarjetaDeCredito tarjetaDeCredito) {
		this.setTarjetaDeCredito(tarjetaDeCredito);
	}

	
	public float getTotalTransaccion() {
		float total = 0;
		for (Juego juego : juegos) {
			descuento = juego.getPrecio()*juego.getPorcentaje()/100;
			total += juego.getPrecio()-descuento;
		}
		return total;
	}
	
	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	
}
