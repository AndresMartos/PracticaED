package aplicacion;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class IniciarSesion extends JPanel {
	private JPasswordField passwordField2;

	/**
	 * Create the panel.
	 */
	public IniciarSesion() {
		setLayout(null);
		
		JLabel etiquetaNombreUsuario = new JLabel("USUARIO:");
		etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaNombreUsuario.setBounds(46, 75, 143, 43);
		add(etiquetaNombreUsuario);
		
		JTextArea nombreUsuarioTxt = new JTextArea();
		nombreUsuarioTxt.setBounds(147, 84, 172, 22);
		add(nombreUsuarioTxt);
		
		JLabel etiquetaContraseña = new JLabel("CONTRASE\u00D1A:");
		etiquetaContraseña.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaContraseña.setBounds(46, 129, 143, 43);
		add(etiquetaContraseña);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(147, 140, 172, 20);
		add(passwordField2);
		
		JButton botonIniciarSesion = new JButton("INICIAR SESION");
		botonIniciarSesion.setBounds(147, 193, 172, 43);
		add(botonIniciarSesion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(46, 266, 89, 23);
		add(btnVolver);

	}
}
