package aplicacion;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Bienvenida extends JPanel {

	/**
	 * Create the panel.
	 */
	public Bienvenida() {
		setBackground(new Color(102, 153, 153));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 40));
		lblNewLabel.setBounds(124, 62, 188, 64);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Iniciar Sesi\u00F3n");
		btnNewButton.setBounds(155, 136, 124, 26);
		add(btnNewButton);

	}
}
