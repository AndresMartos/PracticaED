package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Articulos;
import modelo.Usuario;
import vista.Vender;

public class BaseDatos {
	
	public ArrayList<Articulos> muestraTabla() {
		ArrayList<Articulos> arrArticulos = new ArrayList<>();
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("SELECT * FROM productos");
			
			while(registro.next()) {
				Articulos articuloActual = new Articulos();
				
				articuloActual.setNombreArticulo(registro.getString("nombre"));
				articuloActual.setCantidadCompra(registro.getInt("cantidad"));
				articuloActual.setPrecio(registro.getInt("precio"));
				
				arrArticulos.add(articuloActual);
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arrArticulos;
	}
	
	public boolean registrar(Usuario usuario) {
		boolean existe = false;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda", "root", "");
			Statement consulta = conexion.createStatement(); 
			ResultSet registro = consulta.executeQuery("select nameuser, password from usuarios");
			while(registro.next()&&!existe) {
				if(usuario.getNombre().equals(registro.getString("nameuser")) && usuario.getContrasenia().toString().equals(registro.getString("password"))) {
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
		int valor = 1;
			
		
		 
		try {											// Java Data Base Connection
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select nombre from productos");
			while(registro.next()&&!existe) {
				if(articuloActual.getNombreArticulo().toLowerCase().equals(registro.getString("nombre").toLowerCase())) {
					existe = true;
					
					
					
					valor = update(articuloActual);
					
					if (valor==1) {
						System.out.println("Artículo modificado correctamente");
					}else {
						System.out.println("No se ha modificado correctamente");
					}
					
				}
			}
			conexion.close();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			consulta = conexion.createStatement();
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
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			Statement consulta = conexion.createStatement(); 
			ResultSet registro = consulta.executeQuery("select nameuser, password from usuarios");
			while(registro.next()&&!existe) {
				if(usuario.getNombre().equals(registro.getString("nameuser")) && usuario.getContrasenia().toString().equals(registro.getString("password"))) {
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
	
	public int update(Articulos articuloActual) {
		int valor = 1;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			valor = consulta.executeUpdate("update productos set cantidad = cantidad+" + articuloActual.getCantidadCompra() + ", precio = " + articuloActual.getPrecio());
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  valor;
	}
	
	public ArrayList<Articulos> vender(){
		ArrayList<Articulos> arrArticulo = new ArrayList<>();
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/madridautos", "root", "");
			
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select * from modelos");
			Articulos articulo;
			while(registro.next()) {
				articulo = new Articulos();
				articulo.setNombreArticulo(registro.getString("nombre"));
				articulo.setCantidadCompra(registro.getInt("cantidad"));
				articulo.setPrecio(registro.getInt("precio"));
				arrArticulo.add(articulo);
			}
			conexion.close();
		}catch(SQLException e) {
			System.out.println("No te has conectado a la base de datos");
		}
		
		return arrArticulo;
	}
}
