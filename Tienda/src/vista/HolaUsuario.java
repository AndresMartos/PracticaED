package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class HolaUsuario extends JPanel {

	/**
	 * Create the panel.
	 */
	public HolaUsuario() {
		setBackground(new Color(154,85,204));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido USUARIO");
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblNewLabel.setBounds(155, 145, 311, 150);
		add(lblNewLabel);
		
	}

}
