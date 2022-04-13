package aplicacion;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Compra extends JPanel {
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public Compra() {
		setLayout(null);
		
		setBackground(new Color(154,85,204));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(210, 118, 305, 209);
		add(table);
		
		table_1 = new JTable();
		table_1.setBounds(85, 118, 108, 250);
		add(table_1);
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTienda.setBounds(339, 95, 45, 13);
		add(lblTienda);
		
		JLabel lblCesta = new JLabel("Cesta");
		lblCesta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCesta.setBounds(114, 95, 45, 13);
		add(lblCesta);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(430, 347, 85, 21);
		add(btnComprar);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(335, 347, 85, 21);
		add(btnAtras);

	}
}
