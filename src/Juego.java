
public class Juego {

	private String nombre;
	private float precio;
	private int porcentaje;
	private String descripcion;
	private long codigo;
	private Calificacion calificacion;
	private Genero genero;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public int getPorcentaje() {
		return porcentaje;
	}
	
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public Calificacion getCalificacion() {
		return calificacion;
	}
	
	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
