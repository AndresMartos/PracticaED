package modelo;

/**
 * 
 * @author Diego, Carlos y Andrés
 *
 */
public class Articulos {
	private String nombreArticulo;
	private int cantidadCompra;
	private int precio;
	
	/**
	 * Constructor por defecto de la clase ArticuLos
	 */
	public Articulos() {
		nombreArticulo = null;
		cantidadCompra = 0;
		precio = 0;
	}
	
	/**
	 * Constructor por parámetros de la clase Articulos
	 * @param nombreArticulo
	 * @param cantidadCompra
	 * @param precio
	 */
	public Articulos(String nombreArticulo, int cantidadCompra, int precio) {
		this.nombreArticulo = nombreArticulo;
		this.cantidadCompra = cantidadCompra;
		this.precio = precio;
	}

	/**
	 * Getter de la variable del nombre del articulo
	 * @return nombreArticulo
	 */
	public String getNombreArticulo() {
		return nombreArticulo;
	}

	/**
	 * Setter de la variable del nombre del articulo
	 * @param nombreArticulo
	 */
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	/**
	 * Getter de la variable de la cantidad de la compra
	 * @return cantidadCompra
	 */
	public int getCantidadCompra() {
		return cantidadCompra;
	}

	/**
	 * Setter de la variable de la cantidad de la compra
	 * @param cantidadCompra
	 */
	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}

	/**
	 * Getter de la variable del precio
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Setter de la variable del precio
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
