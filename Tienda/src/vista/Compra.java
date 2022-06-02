package vista;


import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.BaseDatos;
import modelo.Articulos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * Ventana comprar que contiene dos tablas una de los artículos de la tienda y otra de los artículos de la cesta.
 * @author Diego, Carlos y Andrés
 *
 */
public class Compra extends JPanel {
	private JTable jtableTienda;
	private JTable jtableCesta;
	private BaseDatos bd = new BaseDatos();
	private ArrayList<Articulos> arrArticulosTienda = new ArrayList<>();
	private ArrayList<Articulos> arrArticulosCesta = new ArrayList<>();
	private static Articulos articuloActual = new Articulos();

	/**
	 * Crear el panel Comprar
	 */
	public Compra() {
		setLayout(null);
		
		setBackground(new Color(154,85,204));
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTienda.setBounds(377, 95, 45, 13);
		add(lblTienda);
		
		JLabel lblCesta = new JLabel("Cesta");
		lblCesta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCesta.setBounds(129, 95, 45, 13);
		add(lblCesta);
		
		JPanel pnComprar = new JPanel();
		pnComprar.setLayout(null);
		pnComprar.setBackground(new Color(47, 8, 85));
		pnComprar.setBounds(384, 370, 169, 33);
		pnComprar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(pnComprar);
		
		JLabel lblComprar = new JLabel("Comprar");
		lblComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere comprar?","Comprar", JOptionPane.YES_NO_OPTION);
				if(opcion ==  JOptionPane.YES_OPTION) {
					DefaultTableModel dtm = (DefaultTableModel) jtableCesta.getModel();
					dtm.setRowCount(0);
					bd.comprar(arrArticulosCesta);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnComprar.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnComprar.setBackground(new Color(47,8,85));
			}
		});
		lblComprar.setBounds(0, 0, 169, 33);
		pnComprar.add(lblComprar);
		lblComprar.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprar.setForeground(Color.WHITE);
		lblComprar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		
		JScrollPane scrollpanelTienda = new JScrollPane();
		scrollpanelTienda.setBounds(248, 118, 305, 209);
		add(scrollpanelTienda);
		
		JScrollPane scrollpanelCesta = new JScrollPane();
		scrollpanelCesta.setBounds(69, 119, 169, 284);
		add(scrollpanelCesta);
		
		jtableCesta = new JTable(){
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
	         }
		};
		
		Vector vNombres = new Vector();
		vNombres.add("Nombre");
		vNombres.add("Cantidad");
		vNombres.add("Precio");
		
		jtableCesta.setModel(new DefaultTableModel(vNombres,arrArticulosTienda.size()));
		DefaultTableModel model = (DefaultTableModel) jtableCesta.getModel();
		scrollpanelCesta.setViewportView(jtableCesta);
		
		jtableTienda = new JTable(){
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
	         }
		};
		jtableTienda.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTable table =(JTable) e.getSource();
		        Point point = e.getPoint();
		        int row = table.rowAtPoint(point);
		        if (e.getClickCount() == 2 && table.getSelectedColumn() != -1) {
					String nombreArticulo = jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 0).toString();
					int precio = (int)jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 2);
					int cantidadCompra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad: "));
					if(cantidadCompra>(int)jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 1)) {
						JOptionPane.showMessageDialog(null,"Sobrepasas la cantidad de la tienda.");
					}else if(cantidadCompra<=0){
						JOptionPane.showMessageDialog(null,"Número introducido no válido");
					}else {
						for (int i = 0; i < arrArticulosTienda.size(); i++) {
							if(arrArticulosTienda.get(i).getNombreArticulo().equals(nombreArticulo)) {
								System.out.println(arrArticulosTienda.get(i).getCantidadCompra() + " " + cantidadCompra);
								arrArticulosTienda.get(i).setCantidadCompra(arrArticulosTienda.get(i).getCantidadCompra() - cantidadCompra);
							}
						}
						int posicion = indexOfNombre(nombreArticulo);
						if(posicion != -1) {
							System.out.println(posicion);
							model.setValueAt(cantidadCompra + arrArticulosCesta.get(posicion).getCantidadCompra(), posicion, 1);
							arrArticulosCesta.get(posicion).setNombreArticulo(nombreArticulo);
							arrArticulosCesta.get(posicion).setCantidadCompra(cantidadCompra + arrArticulosCesta.get(posicion).getCantidadCompra());
							arrArticulosCesta.get(posicion).setPrecio(precio);
						}else{
							System.out.println(posicion);
							model.addRow(new Object[]{nombreArticulo, cantidadCompra, precio});
							Articulos articulo=new Articulos (nombreArticulo,cantidadCompra,precio);
							arrArticulosCesta.add(articulo);
							for(Articulos a: arrArticulosCesta) {
								System.out.println(a.getNombreArticulo() + "\n");
							}
						}
			    		cargaTablaTienda2();
					}
					
		        	
		        }
			}
		});
		
		jtableCesta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTable table =(JTable) e.getSource();
		        Point point = e.getPoint();
		        int row = table.rowAtPoint(point);
		        if (e.getClickCount() == 2 && table.getSelectedColumn() != -1) {
					String nombreArticulo = jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 0).toString();
					int precio = (int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 2);
					int cantidadCompra = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad: "));
					if(cantidadCompra>(int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 1)) {
						JOptionPane.showMessageDialog(null,"No hay tantos productos en la cesta.");
					}else if(cantidadCompra<=0){
						JOptionPane.showMessageDialog(null,"Número introducido no válido");
					}else {
						for (int i = 0; i < arrArticulosTienda.size(); i++) {
							if(arrArticulosTienda.get(i).getNombreArticulo().equals(nombreArticulo)) {
								System.out.println(arrArticulosTienda.get(i).getCantidadCompra() + " " + cantidadCompra);
								arrArticulosTienda.get(i).setCantidadCompra(arrArticulosTienda.get(i).getCantidadCompra() + cantidadCompra);
							}
						}
						int posicion = indexOfNombre(nombreArticulo);
						if(cantidadCompra==(int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 1)) {
							model.removeRow(jtableCesta.getSelectedRow());
							arrArticulosCesta.remove(posicion);
						}else {
							model.setValueAt((int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 1) - cantidadCompra, jtableCesta.getSelectedRow(), 1);
							arrArticulosCesta.get(posicion).setNombreArticulo(nombreArticulo);
							arrArticulosCesta.get(posicion).setCantidadCompra(arrArticulosCesta.get(posicion).getCantidadCompra() - cantidadCompra);
							arrArticulosCesta.get(posicion).setPrecio(precio);
							
						}
			    		cargaTablaTienda2();
					}
		        }
			}
		});
		scrollpanelTienda.setViewportView(jtableTienda);
		cargaTablaTienda();
	}
	/**
	 * Carga la tabla de tienda con los datos de la base de datos.
	 */
	public void cargaTablaTienda() {
		
		Vector vNombres = new Vector();
		vNombres.add("Nombre");
		vNombres.add("Cantidad");
		vNombres.add("Precio");
		
		arrArticulosTienda = bd.muestraTabla();

		jtableTienda.setModel(new DefaultTableModel(vNombres,arrArticulosTienda.size()));
		
		for (int i = 0; i < arrArticulosTienda.size(); i++) {
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getNombreArticulo(), i, 0);
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getCantidadCompra(), i, 1);
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getPrecio(), i, 2);
		}
	}
	/**
	 * Carga la tabla con los datos que tiene el array en ese momento.
	 */
	public void cargaTablaTienda2() {
		Vector vNombres = new Vector();
		vNombres.add("Nombre");
		vNombres.add("Cantidad");
		vNombres.add("Precio");
		
		jtableTienda.setModel(new DefaultTableModel(vNombres,arrArticulosTienda.size()));
		
		for (int i = 0; i < arrArticulosTienda.size(); i++) {
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getNombreArticulo(), i, 0);
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getCantidadCompra(), i, 1);
			jtableTienda.setValueAt(arrArticulosTienda.get(i).getPrecio(), i, 2);
		}
	}
	/**
	 * Devuelve la posición de el nombre en el array list.
	 * @param nombre
	 * @return -1 si no esta , i si lo ha encontrado.
	 */
	private int indexOfNombre(String nombre) {
	    for (int i = 0; i < arrArticulosCesta.size(); i++)
	        if (arrArticulosCesta.get(i).getNombreArticulo().equals(nombre))
	            return i;
	    return -1;
	}
}
