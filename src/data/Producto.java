package data;

public class Producto {

	private String codigo;
	private int cantidad;
	private float precio;
	private String separacion;
	
	public Producto(String codigo, int cantidad, float precio, String separacion) {
		
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
		this.separacion = separacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getSeparacion() {
		return separacion;
	}

	public void setSeparacion(String separacion) {
		this.separacion = separacion;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + ", separacion="
				+ separacion + "]";
	}
	
	
	
	
	
}
