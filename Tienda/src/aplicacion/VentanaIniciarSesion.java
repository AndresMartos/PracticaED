package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VentanaIniciarSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField campoContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIniciarSesion frame = new VentanaIniciarSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaIniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaNombreUsuario = new JLabel("USUARIO:");
		etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaNombreUsuario.setBounds(32, 40, 143, 43);
		contentPane.add(etiquetaNombreUsuario);
		
		JTextArea nombreUsuarioTxt = new JTextArea();
		nombreUsuarioTxt.setBounds(146, 49, 172, 22);
		contentPane.add(nombreUsuarioTxt);
		
		JLabel etiquetaContraseña = new JLabel("CONTRASE\u00D1A:");
		etiquetaContraseña.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaContraseña.setBounds(32, 90, 143, 43);
		contentPane.add(etiquetaContraseña);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(146, 101, 172, 20);
		contentPane.add(campoContraseña);
		
		JButton botonIniciarSesion = new JButton("INICIAR SESION");
		botonIniciarSesion.setBounds(146, 149, 172, 43);
		contentPane.add(botonIniciarSesion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(292, 227, 89, 23);
		contentPane.add(btnVolver);
	}
}
