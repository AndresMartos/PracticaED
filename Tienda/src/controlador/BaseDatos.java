package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import modelo.Articulos;
import modelo.Usuario;
import vista.Vender;

public class BaseDatos {
	public boolean registrar(Usuario usuario) {
		boolean existe = false;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda", "root", "");
			Statement consulta = conexion.createStatement(); 
			ResultSet registro = consulta.executeQuery("select nameuser, password from usuarios");
			while(registro.next()&&!existe) {
				if(usuario.getNombre() == registro.getString("nameuser") && usuario.getContrasenia().toString() == registro.getString("password")) {
					existe = true;
				}else {
					existe = false;
					
				}
			}
			
			if(!existe) {
				consulta.executeUpdate("INSERT INTO usuarios(nameuser, password) VALUES('" + usuario.getNombre() + "','" + usuario.getContrasenia().toString() + "')");
				
			}
			conexion.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
	

	public boolean VenderArticulo(Articulos articuloActual) {
		// TODO Auto-generated method stub
		
		boolean existe = false;
			
		
		 
		try {											// Java Data Base Connection
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select nombre from productos");
			while(registro.next()&&!existe) {
				if(articuloActual.getNombreArticulo().toLowerCase() == registro.getString("nombre")) {
					existe = true;
					int valor = consulta.executeUpdate("update productos set cantidad = cantidad+" + articuloActual.getCantidadCompra());
					
					if (valor==1) {
						System.out.println("Artículo modificado correctamente");
					}else {
						System.out.println("No existe un artículo con dicho identificador");
					}
					
				}else {
					existe = false;
				}
			}
			if(!existe) {
				consulta.executeUpdate("INSERT INTO `productos` (`nombre`, `cantidad`, `precio`) VALUES"
							+ "("+ "'" + articuloActual.getNombreArticulo() + "'," + "'" 
							+ articuloActual.getCantidadCompra() + "'," + articuloActual.getPrecio() + ")");
			}		
				conexion.close();
				System.out.println("Articulo guardado correctamente");
		} catch (SQLException e1){
			e1.printStackTrace();
		}
		
		
		return existe;
		
		
	}
	
	public boolean iniciarSesion(Usuario usuario) {
		boolean existe = false;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/db_articulos", "root", "");
			Statement consulta = conexion.createStatement(); 
			ResultSet registro = consulta.executeQuery("select nameuser, password from usuarios");
			while(registro.next()&&!existe) {
				if(usuario.getNombre() == registro.getString("nameuser") && usuario.getContrasenia().toString() == registro.getString("password")) {
					existe = true;
				}else {
					existe = false;
				}
			}
			conexion.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return existe;
	}
}
