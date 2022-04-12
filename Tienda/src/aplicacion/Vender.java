package aplicacion;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;

public class Vender extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Vender() {
		setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(135, 312, 89, 23);
		add(btnVolver);
		
		JLabel lblNProducto = new JLabel("Producto");
		lblNProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNProducto.setBounds(154, 118, 52, 33);
		add(lblNProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(154, 178, 52, 14);
		add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(160, 228, 46, 14);
		add(lblPrecio);
		
		textField = new JTextField();
		textField.setBounds(216, 125, 281, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 176, 281, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(216, 226, 281, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(409, 312, 89, 23);
		add(btnVender);		
	}
}
