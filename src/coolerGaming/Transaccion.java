package coolerGaming;

import java.util.List;


public class Transaccion {

	private float totalTransaccion;
	private int cantJuegos;
	private TarjetaDeCredito tarjetaDeCredito;
	private UsuarioRegistrado usuarioRegistrado;
    private List<Juego> juegos;
	
	public float getTotalTransaccion() {
		return totalTransaccion;
	}
	
	public void setTotalTransaccion(float totalTransaccion) {
		this.totalTransaccion = totalTransaccion;
	}
	
	public int getCantJuegos() {
		return cantJuegos;
	}
	
	public void setCantJuegos(int cantJuegos) {
		this.cantJuegos = cantJuegos;
	}
	
	public TarjetaDeCredito getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}
	
	public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}

	public UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}

	public void setUsuarioRegistrado(UsuarioRegistrado usuarioRegistrado) {
		this.usuarioRegistrado = usuarioRegistrado;
	}

    public List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }
	
}