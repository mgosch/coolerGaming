package coolerGaming;

import java.util.ArrayList;
import java.util.List;

import test.Sistema;


public abstract class Transaccion {

	private int cantJuegos;
	private TarjetaDeCredito tarjetaDeCredito;
	private UsuarioRegistrado usuarioRegistrado;
    protected List<Juego> juegos = new ArrayList<Juego>();
	
	public abstract float getTotalTransaccion(); 
	
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
    
	public String verificarTarjeta(String numero, String codigoSeguridad, java.util.Date fechaExpiracion){
		Sistema sist = new Sistema();
	    if (!sist.isValidTarjeta(numero, codigoSeguridad, fechaExpiracion)) {
	    	return "Tarjeta invalida";
	    } else {
	    	return "Tarjeta valida";
	    }
	}
	
}
