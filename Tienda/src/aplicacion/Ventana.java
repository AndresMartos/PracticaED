package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setIconImage(new ImageIcon(getClass().getResource("/Images/bonsai.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Panel.background"));
		contentPane.setForeground(new Color(0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel bienvenida = new JPanel();
		contentPane.add(bienvenida, "name_254983978724600");
		bienvenida.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 40));
		lblNewLabel.setBounds(122, 50, 188, 64);
		bienvenida.add(lblNewLabel);
		
		JButton btnRegistrarse = new JButton("Registrarte");
		
		btnRegistrarse.setBounds(153, 124, 124, 26);
		bienvenida.add(btnRegistrarse);
		
		JButton btnIniciar = new JButton("Iniciar Sesi\u00F3n");
		btnIniciar.setBounds(153, 160, 124, 26);
		bienvenida.add(btnIniciar);
		
		
		JPanel registrarse = new JPanel();
		contentPane.add(registrarse, "name_255117660893400");
		registrarse.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EMPECEMOS!!");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(159, 10, 142, 39);
		registrarse.add(lblNewLabel_1);
		
		JLabel etiquetaaliasusuario_1 = new JLabel("Nombre_usuario:");
		etiquetaaliasusuario_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetaaliasusuario_1.setBounds(42, 96, 112, 27);
		registrarse.add(etiquetaaliasusuario_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 99, 222, 20);
		registrarse.add(textField);
		
		JLabel etiquetacontraseña_1 = new JLabel("Contrase\u00F1a:");
		etiquetacontraseña_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetacontraseña_1.setBounds(42, 134, 112, 27);
		registrarse.add(etiquetacontraseña_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 134, 222, 20);
		registrarse.add(passwordField);
		
		JCheckBox aceptarLOPD_1 = new JCheckBox("Aceptar Terminos y Condiciones sobre la LOPD");
		aceptarLOPD_1.setBounds(42, 168, 312, 23);
		registrarse.add(aceptarLOPD_1);
		
		JButton btnCrear_1 = new JButton("Crear");
		btnCrear_1.setBounds(301, 225, 89, 23);
		registrarse.add(btnCrear_1);
		
		JButton btnVolver_1 = new JButton("Volver");
		btnVolver_1.setBounds(188, 225, 89, 23);
		registrarse.add(btnVolver_1);
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bienvenida.setVisible(false);
			registrarse.setVisible(true);
			}
		});
		
		
	}
	
}
