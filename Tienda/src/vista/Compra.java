package vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.BaseDatos;

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

public class Compra extends JPanel {
	private JTable jtableTienda;
	private JTable jtableCesta;
	private BaseDatos bd = new BaseDatos();

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
		
		bd.muestraTabla(jtableTienda);

	}
}
