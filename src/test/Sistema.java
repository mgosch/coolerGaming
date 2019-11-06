package test;

import java.util.Date;

public class Sistema {

	public boolean isValidTarjeta(String numero, String codigoSeguridad, Date fechaExpiracion) {
		if (numero.equals("4509790045234220")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isJuegoAlquilado(String juego) {
		if (juego.equals("Pacman")) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getPuntaje(String juego) {
		if (juego.equals("Pacman")) {
			return 8;
		} else {
			return 0;
		}
	}
}
