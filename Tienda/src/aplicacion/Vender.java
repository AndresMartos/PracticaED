package aplicacion;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
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
		
		setBackground(new Color(154,85,204));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(111, 306, 89, 23);
		add(btnVolver);
		
		JLabel lblNProducto = new JLabel("Producto");
		lblNProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNProducto.setBounds(130, 112, 52, 33);
		add(lblNProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(130, 172, 52, 14);
		add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(136, 222, 46, 14);
		add(lblPrecio);
		
		textField = new JTextField();
		textField.setBounds(192, 119, 281, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 170, 281, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(192, 220, 281, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(385, 306, 89, 23);
		add(btnVender);		
	}
}
