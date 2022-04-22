package modelo;

public class Usuario {
	String nombre;
	char[] contrasenia;
	
	public Usuario() {
		nombre = "default00";
		contrasenia = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char[] getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(char[] contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}
