package aplicacion;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnRegistrarse = new JButton("Registrarte");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrarse r = new Registrarse();
				Ventana v = new Ventana();
				v.nuevoPanel(r);
			}
		});
		btnRegistrarse.setBounds(155, 136, 124, 26);
		add(btnRegistrarse);
		
		JButton btnIniciar = new JButton("Iniciar Sesi\u00F3n");
		btnIniciar.setBounds(155, 172, 124, 26);
		add(btnIniciar);

	}
}
