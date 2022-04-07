package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import modelo.Articulos;
import modelo.Usuario;

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
			 * 	Aqui faltaria añadir el idCliente (NO NECESARIO) que tengo en la bbdd
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
	
	public void nuevoArticulo() {
		
		/**
		 * 
		 * Metodo para insertar datos de Articulos
		 * 
		 */
		
		Articulos art = new Articulos();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte nombre del articulo: ");
		art.setNombreArticulo(sc.nextLine());
		
		System.out.print("Inserte la descripcion del mismo: ");
		art.setDescripcion(sc.nextLine());
		
		System.out.print("Inserte el precio del articulo: ");
		art.setPrecio(sc.nextInt());
		
		/**
		 * 
		 * Esta opcion, de la cantidad de articulos
		 * CHECKEAR MAS VER OPCIONES PARA ESTA FUNCION!!
		 * no se si lo añadiria el vendedor, como... cantidad disponibles
		 * O el usuario(cliente) que dice cuantos quiere comprar
		 * HABLAR Y CAMBIAR
		 * 
		 */
		System.out.print("Inserte la cantidad de articulos a vender: ");
		art.setCantidadCompra(sc.nextInt());
		
		try {
			
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost/prueba_ed_proy", "root", "");
			
			Statement consulta = conex.createStatement();
			
			consulta.executeUpdate("INSERT INTO articulos(nombreArt, descripcion, cantidadAComprar, precioArticulo)" 
			+ "VALUES (" + "'" + art.getNombreArticulo() + "', '" + art.getDescripcion() + "', '" + art.getCantidadCompra() + "', '" + art.getPrecio() + "');");
			
			conex.close();
			System.out.println(" ARTICULO INSERTADOS CORRECTAMENTE");
			
		} catch (SQLException a ) {
			
			a.printStackTrace();
			
		}
	}
}
