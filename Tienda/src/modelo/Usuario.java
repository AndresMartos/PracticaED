package modelo;

/**
 * 
 * @author Diego, Carlos y Andrés
 *
 */
public class Usuario {
	private String nombre;
	private String contrasenia;
	
	/**
	 * Constructor por defecto de la clase Usuario
	 */
	public Usuario() {
		nombre = "default00";
		contrasenia = null;
	}
	
	/**
	 * Constructor por parámetros de la clase Usuario 
	 * @param nombre
	 * @param contrasenia
	 */
	public Usuario(String nombre, String contrasenia) {
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}

	/**
	 * Getter de la variable del nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de la variable del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de la variable contrasenia
	 * @return contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * Setter de la variable contrasenia
	 * @param contrasenia
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
