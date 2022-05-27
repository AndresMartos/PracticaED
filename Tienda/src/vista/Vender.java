package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.BaseDatos;
import modelo.Articulos;
import javax.swing.JSpinner;

public class Vender extends JPanel {
	private JTextField txtProducto;
	private boolean existe = false;
	private BaseDatos bd = new BaseDatos();
	private ArrayList<Articulos> arrArticulo = new ArrayList<>();

	/**
	 * Crea el Panel.
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
		
		JPanel pnVender = new JPanel();
		
		pnVender.setLayout(null);
		pnVender.setBackground(new Color(47, 8, 85));
		pnVender.setBounds(304, 285, 169, 33);
		pnVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(pnVender);
		
		JSpinner spnPrecio = new JSpinner();
		spnPrecio.setBounds(192, 220, 281, 20);
		spnPrecio.setEditor(new JSpinner.DefaultEditor(spnPrecio));
		add(spnPrecio);
		
		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBounds(192, 170, 281, 20);
		spnCantidad.setEditor(new JSpinner.DefaultEditor(spnCantidad));
		add(spnCantidad);
		
		
		
		JLabel lblVender = new JLabel("Vender Producto");
		lblVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtProducto.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Introduzca un producto!");
				}else if((int)spnCantidad.getValue()<=0) {
					JOptionPane.showMessageDialog(null, "Introduzca una cantidad a partir de 1");
				}else if((int)spnPrecio.getValue()<=0) {
					JOptionPane.showMessageDialog(null, "Introduzca un precio a partir de 1");
					
				}else {
					
					Articulos articuloActual = new Articulos();
					String nombre = txtProducto.getText();
					int cantidad = (int)spnCantidad.getValue();
					int precio = (int)spnPrecio.getValue();
					
					articuloActual.setNombreArticulo(nombre);
					articuloActual.setCantidadCompra(cantidad);
					articuloActual.setPrecio(precio);
					
					for(Articulos art : arrArticulo) {
						System.out.println(articuloActual.getNombreArticulo());
						if(articuloActual.getNombreArticulo().toLowerCase().equals(art.getNombreArticulo().toLowerCase())) {
							int opcion = JOptionPane.showConfirmDialog(txtProducto,"Hay un producto con un precio diferente, ¿seguro que quiere cambiarle el precio?","Añadir a la BD", JOptionPane.YES_NO_OPTION);
							if(opcion ==  JOptionPane.YES_OPTION) {
								bd.VenderArticulo(articuloActual);
							}
							existe = true;
						}
					}
					if(!existe) {
						bd.VenderArticulo(articuloActual);
					}
					
					System.out.println(nombre);
					System.out.println(cantidad);
					System.out.println(precio);
					
					
					txtProducto.setText("");
					spnPrecio.setValue(0);
					spnCantidad.setValue(0);
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
