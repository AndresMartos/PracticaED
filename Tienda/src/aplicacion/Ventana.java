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
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
		lblNewLabel.setBounds(73, 49, 282, 64);
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
		btnVolver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarse.setVisible(false);
				bienvenida.setVisible(true);
			}
		});
		btnVolver_1.setBounds(188, 225, 89, 23);
		registrarse.add(btnVolver_1);
		
		JPanel iniciarSesion = new JPanel();
		contentPane.add(iniciarSesion, "name_4900145967085");
		iniciarSesion.setLayout(null);
		
		JLabel etiquetaNombreUsuario = new JLabel("USUARIO:");
		etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaNombreUsuario.setBounds(45, 65, 143, 43);
		iniciarSesion.add(etiquetaNombreUsuario);
		
		JLabel etiquetaContraseña = new JLabel("CONTRASE\u00D1A:");
		etiquetaContraseña.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		etiquetaContraseña.setBounds(45, 119, 143, 43);
		iniciarSesion.add(etiquetaContraseña);
		
		JTextArea nombreUsuarioTxt = new JTextArea();
		nombreUsuarioTxt.setBounds(151, 74, 172, 22);
		iniciarSesion.add(nombreUsuarioTxt);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(151, 130, 172, 20);
		iniciarSesion.add(passwordField_1);
		
		JButton botonIniciarSesion = new JButton("INICIAR SESION");
		
		botonIniciarSesion.setBounds(151, 173, 172, 43);
		iniciarSesion.add(botonIniciarSesion);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarSesion.setVisible(false);
				bienvenida.setVisible(true);
			}
		});
		btnVolver.setBounds(45, 227, 89, 23);
		iniciarSesion.add(btnVolver);
		
		JPanel venderComprar = new JPanel();
		contentPane.add(venderComprar, "name_5455405255416");
		venderComprar.setLayout(null);
		
		JLabel lbnPregunta = new JLabel("Elija la acci\u00F3n que desea realizar");
		lbnPregunta.setFont(new Font("Tahoma", Font.BOLD, 22));
		lbnPregunta.setBounds(29, 29, 370, 31);
		venderComprar.add(lbnPregunta);
		
		JButton btnComprar = new JButton("Comprar");
		
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnComprar.setBounds(29, 91, 180, 81);
		venderComprar.add(btnComprar);
		
		JButton btnVender = new JButton("Vender");
		
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVender.setBounds(219, 91, 180, 81);
		venderComprar.add(btnVender);
		
		JButton btnVolver_2 = new JButton("Volver");
		btnVolver_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venderComprar.setVisible(false);
				bienvenida.setVisible(true);
			}
		});
		btnVolver_2.setBounds(29, 227, 89, 23);
		venderComprar.add(btnVolver_2);
		
		JPanel comprar = new JPanel();
		contentPane.add(comprar, "name_5752464109893");
		comprar.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 35, 108, 215);
		comprar.add(table);
		
		JLabel lblCesta = new JLabel("Cesta");
		lblCesta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCesta.setBounds(37, 11, 45, 13);
		comprar.add(lblCesta);
		
		table_1 = new JTable();
		table_1.setBounds(128, 47, 296, 167);
		comprar.add(table_1);
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTienda.setBounds(252, 11, 45, 13);
		comprar.add(lblTienda);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar.setVisible(false);
				venderComprar.setVisible(true);
			}
		});
		btnAtras.setBounds(252, 229, 85, 21);
		comprar.add(btnAtras);
		
		JButton btnComprar_1 = new JButton("Comprar");
		btnComprar_1.setBounds(339, 229, 85, 21);
		comprar.add(btnComprar_1);
		
		JPanel vender = new JPanel();
		contentPane.add(vender, "name_5762977731317");
		vender.setLayout(null);
		
		JButton btnVender_1 = new JButton("Vender");
		btnVender_1.setBounds(308, 227, 89, 23);
		vender.add(btnVender_1);
		
		JButton btnVolver_3 = new JButton("Volver");
		btnVolver_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vender.setVisible(false);
				venderComprar.setVisible(true);
			}
		});
		btnVolver_3.setBounds(34, 227, 89, 23);
		vender.add(btnVolver_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(115, 141, 281, 20);
		vender.add(textField_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(59, 143, 46, 14);
		vender.add(lblPrecio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(115, 91, 281, 20);
		vender.add(textField_2);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(53, 93, 52, 14);
		vender.add(lblCantidad);
		
		JLabel lblNProducto = new JLabel("Producto");
		lblNProducto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNProducto.setBounds(53, 33, 52, 33);
		vender.add(lblNProducto);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(115, 40, 281, 20);
		vender.add(textField_3);
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bienvenida.setVisible(false);
			registrarse.setVisible(true);
			}
		});
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bienvenida.setVisible(false);
				iniciarSesion.setVisible(true);
			}
		});
		
		btnCrear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarse.setVisible(false);
				venderComprar.setVisible(true);
			}
		});
		
		botonIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarSesion.setVisible(false);
				venderComprar.setVisible(true);
			}
		});
		
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venderComprar.setVisible(false);
				comprar.setVisible(true);
			}
		});
		
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venderComprar.setVisible(false);
				vender.setVisible(true);
			}
		});
		
	}
}
