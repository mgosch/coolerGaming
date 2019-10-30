package coolerGaming;

public class Compra extends Transaccion{

	private float descuento;

	public Compra(TarjetaDeCredito tarjetaDeCredito) {
		this.setTarjetaDeCredito(tarjetaDeCredito);
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	
}
