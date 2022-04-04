package modelo;

public class Usuario {
	String nombre_usuario;
	String password_usuario;
	
	public Usuario() {
		nombre_usuario = "default00";
		password_usuario = null;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword_usuario() {
		return password_usuario;
	}

	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}
	
	
}
