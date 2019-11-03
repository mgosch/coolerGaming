package coolerGaming;
import java.util.List;

public class Juego {

	private String nombre;
	private float precio;
	private int porcentaje;
	private String descripcion;
	private long codigo;
	private List<Genero> genero;
	
	public Juego(String nombre, float precio, int porcentaje, String descripcion, long codigo, List<Genero> genero){
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPorcentaje(porcentaje);
		this.setDescripcion(descripcion);
		this.setCodigo(codigo);
		this.setGenero(genero);
	}
	
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
	
    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }
	
}


	