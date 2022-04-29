package vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.BaseDatos;
import modelo.Articulos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
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
	private ArrayList<Articulos> arrArticulos = new ArrayList<>();

	/**
	 * Create the panel.
	 */
	public Compra() {
		setLayout(null);
		
		setBackground(new Color(154,85,204));
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTienda.setBounds(339, 95, 45, 13);
		add(lblTienda);
		
		JLabel lblCesta = new JLabel("Cesta");
		lblCesta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCesta.setBounds(114, 95, 45, 13);
		add(lblCesta);
		
		JPanel pnComprar = new JPanel();
		pnComprar.setLayout(null);
		pnComprar.setBackground(new Color(47, 8, 85));
		pnComprar.setBounds(346, 370, 169, 33);
		add(pnComprar);
		
		JLabel lblComprar = new JLabel("Comprar");
		lblComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblComprar.setBounds(0, 0, 169, 33);
		pnComprar.add(lblComprar);
		lblComprar.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprar.setForeground(Color.WHITE);
		lblComprar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		
		JScrollPane scrollpanelTienda = new JScrollPane();
		scrollpanelTienda.setBounds(210, 118, 305, 209);
		add(scrollpanelTienda);
		
		jtableTienda = new JTable();
		jtableTienda.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		scrollpanelTienda.setViewportView(jtableTienda);
		
		JScrollPane scrollpanelCesta = new JScrollPane();
		scrollpanelCesta.setBounds(70, 119, 120, 284);
		add(scrollpanelCesta);
		
		jtableCesta = new JTable();
		scrollpanelCesta.setViewportView(jtableCesta);
		
		Vector vNombres = new Vector();
		vNombres.add("Nombre");
		vNombres.add("Cantidad");
		vNombres.add("Precio");
		
		arrArticulos = bd.muestraTabla();

		jtableTienda.setModel(new DefaultTableModel(vNombres,arrArticulos.size()));
		
		for (int i = 0; i < arrArticulos.size(); i++) {
			jtableTienda.setValueAt(arrArticulos.get(i).getNombreArticulo(), i, 0);
			jtableTienda.setValueAt(arrArticulos.get(i).getCantidadCompra(), i, 1);
			jtableTienda.setValueAt(arrArticulos.get(i).getPrecio(), i, 2);
		}
	}
}
