package aplicacion;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;

public class VenderComprar extends JPanel {

	/**
	 * Create the panel.
	 */
	public VenderComprar() {
		setLayout(null);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnComprar.setBounds(37, 115, 180, 81);
		add(btnComprar);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVender.setBounds(227, 115, 180, 81);
		add(btnVender);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(37, 254, 89, 23);
		add(btnVolver);
		
		JLabel lbnPregunta = new JLabel("Elija la acci\u00F3n que desea realizar");
		lbnPregunta.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbnPregunta.setBounds(37, 55, 370, 31);
		add(lbnPregunta);

	}
}
