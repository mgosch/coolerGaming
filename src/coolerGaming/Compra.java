package coolerGaming;

import test.Sistema;

public class Compra extends Transaccion{

	private float descuento;

	public Compra(TarjetaDeCredito tarjetaDeCredito) {
		this.setTarjetaDeCredito(tarjetaDeCredito);
	}

	
	public float getTotalTransaccion() {
		float total = 0;
		for (Juego juego : juegos) {
			Sistema sist = new Sistema();
			if (sist.isJuegoAlquilado(juego.getNombre())){
				descuento = juego.getPrecio()*juego.getPorcentaje()/100;
			} else {
				descuento = 0;
			}
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
