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

/**
 * 
 * @author Diego, Carlos y Andrés
 *
 */
public class BaseDatos {
	
	/**
	 * Se realiza para cargar el array de los articulos de la base de dates 
	 * y usarlo para mostrar los articulos en la tabla.
	 * @return arrArticulos
	 */
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
	
	/**
	 * El usuario al pulsar registrarse se pasará al usuario por parámetro, se buscará si existe en la base de datos, 
	 * si no, se inserta en la tabla de usuarios el nuevo usuario, retorna el estado, si existe el usuario o no.
	 * @param usuario
	 * @return existe
	 */
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
	
	/**
	 * Se realiza una consulta a los artículos de la base de datos, si el objeto articulo pasado por parámetro existe,
	 * se realiza una modificación del existente, enviándolo al método "update", si no existe, se inserta. Se devuelve si existe o no.
	 * @param articuloActual
	 * @return existe
	 */
	public boolean VenderArticulo(Articulos articuloActual) {
		// TODO Auto-generated method stub
		
		boolean existe = false;
		int valor = 1;
			
		
		 
		try {											// Java Data Base Connection
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select * from productos");
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
	
	/**
	 * Al dar al botón de iniciar sesión, se pasa por parámetro el objeto usuario, al que se compara con la base de datos,
	 * si el usuario no existe, saltará un aviso de que el usuario no existe, 
	 * si existe se enviará al usuario a la ventana de Comprar y Vender.
	 * @param usuario
	 * @return existe
	 */
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
	
	/**
	 * Se pasará por parámetro el objeto articuloActual del método de "vender" 
	 * y se actualizará en la base de datos el producto introducido.
	 * @param articuloActual
	 * @return valor
	 */
	public int update(Articulos articuloActual) {
		int valor = 1;
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trab_final_tienda","root","");
			
			Statement consulta = conexion.createStatement();
			valor = consulta.executeUpdate("update productos set cantidad = cantidad+" + articuloActual.getCantidadCompra());
//			valor = consulta.executeUpdate("update productos set cantidad = cantidad+" + articuloActual.getCantidadCompra() + ", precio = " + articuloActual.getPrecio());
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  valor;
	}
}
