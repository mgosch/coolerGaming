package coolerGaming;

public class Calificacion {

	private String comentario;
	private int puntaje;
	private UsuarioRegistrado usuarioRegistrado;
	
	public Calificacion(String comentario, int puntaje, UsuarioRegistrado usuarioRegistrado) {
		this.setComentario(comentario);
		this.setPuntaje(puntaje);
		this.setUsuarioRegistrado(usuarioRegistrado);
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public UsuarioRegistrado getUsuarioRegistrado() {
		return usuarioRegistrado;
	}

	public void setUsuarioRegistrado(UsuarioRegistrado usuarioRegistrado) {
		this.usuarioRegistrado = usuarioRegistrado;
	}
}
