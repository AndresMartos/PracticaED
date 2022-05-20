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
import java.util.Vector;

public class Compra extends JPanel {
	private JTable jtableTienda;
	private JTable jtableCesta;
	private BaseDatos bd = new BaseDatos();
	private ArrayList<Articulos> arrArticulosTienda = new ArrayList<>();
	private Articulos articuloActual = new Articulos();

	/**
	 * Create the panel.
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
				DefaultTableModel dtm = (DefaultTableModel) jtableCesta.getModel();
				dtm.setRowCount(0);
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
		jtableCesta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTable table =(JTable) e.getSource();
		        Point point = e.getPoint();
		        int row = table.rowAtPoint(point);
		        if (e.getClickCount() == 2 && table.getSelectedColumn() != -1) {

//					String nombreArticulo = jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 0).toString();
//					int cantidadCesta = (int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 1);
//					int precio = (int)jtableCesta.getModel().getValueAt(jtableCesta.getSelectedRow(), 2);
					
					articuloActual.getNombreArticulo();
					articuloActual.getCantidadCompra();
					articuloActual.getPrecio();
					
		        	System.out.println(articuloActual.getNombreArticulo());
		        	System.out.println(articuloActual.getCantidadCompra());
		        	System.out.println(articuloActual.getPrecio());
		        	
		        	DefaultTableModel modelo = (DefaultTableModel) jtableCesta.getModel();
		        	modelo.removeRow(jtableCesta.getSelectedRow());
		        	
		        }
			}
			
		});
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

		        	Articulos articuloActual = new Articulos();
					
					String nombreArticulo = jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 0).toString();
					int cantidadCompra = (int)jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 1);
					int precio = (int)jtableTienda.getModel().getValueAt(jtableTienda.getSelectedRow(), 2);
					
					articuloActual.setNombreArticulo(nombreArticulo);
					articuloActual.setCantidadCompra(cantidadCompra);
					articuloActual.setPrecio(precio);
					
		        	System.out.println(nombreArticulo);
		        	System.out.println(cantidadCompra);
		        	System.out.println(precio);
		        	
		        	
		        	Vector vNombres = new Vector();
		    		vNombres.add("Nombre");
		    		vNombres.add("Cantidad");
		    		vNombres.add("Precio");
		    		
		    		jtableCesta.setModel(new DefaultTableModel(vNombres,arrArticulosTienda.size()));
		    		
		        	DefaultTableModel model = (DefaultTableModel) jtableCesta.getModel();
		        	model.addRow(new Object[]{nombreArticulo, cantidadCompra, precio});
		    		
		    		cargaTablaTienda();
		        	
		        }
			}
		});
		scrollpanelTienda.setViewportView(jtableTienda);
		cargaTablaTienda();
	}
	
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
}
