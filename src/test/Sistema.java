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
}
