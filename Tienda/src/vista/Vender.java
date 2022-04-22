package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.BaseDatos;
import modelo.Articulos;

public class Vender extends JPanel {
	private JTextField txtProducto;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private BaseDatos bd = new BaseDatos();

	/**
	 * Create the panel.
	 */
	public Vender() {
		setLayout(null);
		
		setBackground(new Color(154,85,204));
		
		JLabel lblNProducto = new JLabel("Producto");
		lblNProducto.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 24));
		lblNProducto.setBounds(64, 119, 118, 20);
		add(lblNProducto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 24));
		lblCantidad.setBounds(64, 170, 118, 20);
		add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 24));
		lblPrecio.setBounds(93, 220, 89, 20);
		add(lblPrecio);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(192, 119, 281, 20);
		add(txtProducto);
		txtProducto.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(192, 170, 281, 20);
		add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(192, 220, 281, 20);
		add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JPanel pnVender = new JPanel();
		
		pnVender.setLayout(null);
		pnVender.setBackground(new Color(47, 8, 85));
		pnVender.setBounds(304, 285, 169, 33);
		pnVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(pnVender);
		
		JLabel lblVender = new JLabel("Vender Producto");
		lblVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtProducto.getText().equals("") || txtCantidad.getText().equals("") || txtPrecio.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Introduzca todos los datos!");
				}else {
					Articulos articuloActual = new Articulos();
					String nombre = txtProducto.getText();
					int cantidad = Integer.parseInt(txtCantidad.getText());
					int precio = Integer.parseInt(txtPrecio.getText());
					
					articuloActual.setNombreArticulo(nombre);
					articuloActual.setCantidadCompra(cantidad);
					articuloActual.setPrecio(precio);
					
					bd.VenderArticulo(articuloActual);
					
					System.out.println(nombre);
					System.out.println(cantidad);
					System.out.println(precio);
					
					
					txtProducto.setText("");
					txtCantidad.setText("");
					txtPrecio.setText("");
				}
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnVender.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnVender.setBackground(new Color(47,8,85));
			}
		});
		lblVender.setBounds(0, 0, 169, 33);
		pnVender.add(lblVender);
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(Color.WHITE);
		lblVender.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
	}
}
