package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import modelo.Articulos;
import modelo.Usuario;
import vista.Vender;

public class BaseDatos {
	public void nuevoCliente() {
		/**
		 * VARIABLES U OBJETOS QUE SE UTILIZARAN PARA INSERTAR LOS DATOS
		 */
		Usuario nuevo = new Usuario();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el nombre del usuario: ");
		nuevo.setNombre_usuario(sc.nextLine());
		System.out.print("Inserte la password del usuario: ");
		nuevo.setPassword_usuario(sc.nextLine());
		
		try {
			
			Connection conex = DriverManager.getConnection(
					"jdbc:mysql://localhost/prueba_ed_proy", "root", "");
			
			Statement consulta = conex.createStatement();
			
			/**
			 * 
			 * IMPORTANTE!!
			 * 	Aqui faltaria a�adir el idCliente (NO NECESARIO) que tengo en la bbdd
			 * 
			 * LA CONEXION --> Perfecta, sube los datos correctamente
			 * 
			 * FALTA --> 1. CONSULTA 
			 * 			 2. MODIFICAR
			 * 			 3. BORRAR USUARIO
			 * 
			 */
			consulta.executeUpdate("INSERT INTO usuarios (username, password)"
					+ "VALUES ("+ "'" + nuevo.getNombre_usuario() + "', '" + nuevo.getPassword_usuario() + "');");
			
			conex.close();
			System.out.println("DATOS USUARIOS GUARDADOS CORRECTAMENTE");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void nuevoArticulo(Vender vende) {
		
		System.out.println(nombre);
		System.out.println(cantidad);
		System.out.println(precio);
		

		try {											// Java Data Base Connection
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate("INSERT INTO `productos` (`nombre`, `cantidad`, `precio`) VALUES"
					+ "("+ "'" + nombre + "'," + "'" + cantidad + "'," + precio + ")");
			
			conexion.close();
			System.out.println("Articulo guardado correctamente");
		} catch (SQLException e1){
			e1.printStackTrace();
		}

		
		txtProducto.setText("");
		txtCantidad.setText("");
		txtPrecio.setText("");
	}
}
