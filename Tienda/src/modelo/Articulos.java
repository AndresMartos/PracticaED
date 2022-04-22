package modelo;

public class Articulos {
	String nombreArticulo;
	int cantidadCompra;
	int precio;
	
	public Articulos() {
		nombreArticulo = null;
		cantidadCompra = 0;
		precio = 0;
	}
	
	public Articulos(String nombreArticulo, int cantidadCompra, int precio) {
		super();
		this.nombreArticulo = nombreArticulo;
		this.cantidadCompra = cantidadCompra;
		this.precio = precio;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public int getCantidadCompra() {
		return cantidadCompra;
	}

	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
