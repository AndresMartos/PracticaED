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
	private JPasswordField campoContrase�a;

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
		
		JLabel etiquetaContrase�a = new JLabel("CONTRASE\u00D1A:");
		etiquetaContrase�a.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaContrase�a.setBounds(32, 90, 143, 43);
		contentPane.add(etiquetaContrase�a);
		
		campoContrase�a = new JPasswordField();
		campoContrase�a.setBounds(146, 101, 172, 20);
		contentPane.add(campoContrase�a);
		
		JButton botonIniciarSesion = new JButton("INICIAR SESION");
		botonIniciarSesion.setBounds(146, 149, 172, 43);
		contentPane.add(botonIniciarSesion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(292, 227, 89, 23);
		contentPane.add(btnVolver);
	}
}
