package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import controlador.BaseDatos;
import modelo.Usuario;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private BaseDatos bd = new BaseDatos();
	/**
	 * Launch the application.
	 */
	public void cargarVentana(JFrame frame) {
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setIconImage(new ImageIcon(getClass().getResource("/Images/bonsai.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Panel.background"));
		contentPane.setForeground(new Color(0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(154,85,204));
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(Ventana.class.getResource("/Images/bonsai.png")));
		lblIcon.setToolTipText("");
		lblIcon.setBounds(576, 117, 208, 60);
		contentPane.add(lblIcon);
		
		JLabel lblDer = new JLabel("");
		lblDer.setToolTipText("");
		lblDer.setIcon(new ImageIcon(Ventana.class.getResource("/Images/imgDer.png")));
		lblDer.setBounds(524, 0, 260, 461);
		contentPane.add(lblDer);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblUser.setBounds(32, 117, 152, 33);
		contentPane.add(lblUser);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		txtUser.setText("Usuario");
		txtUser.setBounds(42, 161, 232, 25);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setBackground(new Color(154,85,204));
		txtUser.setBorder(null);
		
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblPassword.setBounds(32, 223, 166, 33);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		txtPassword.setEchoChar('*');
		txtPassword.setToolTipText("");
		txtPassword.setBounds(42, 267, 232, 25);
		contentPane.add(txtPassword);
		txtPassword.setBackground(new Color(154,85,204));
		txtPassword.setBorder(null);
		txtPassword.setText("Contraseña");
		
		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		separator1.setForeground(Color.BLACK);
		separator1.setBounds(42, 185, 232, 2);
		contentPane.add(separator1);
		
		JSeparator separator2 = new JSeparator();
		separator2.setForeground(Color.BLACK);
		separator2.setBackground(Color.BLACK);
		separator2.setBounds(42, 291, 232, 2);
		contentPane.add(separator2);
		
		JPanel pnlIniciar = new JPanel();
		pnlIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		pnlIniciar.setBounds(42, 333, 103, 33);
		contentPane.add(pnlIniciar);
		pnlIniciar.setBackground(new Color(47,8,85));
		pnlIniciar.setLayout(null);
		pnlIniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblIniciar = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlIniciar.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlIniciar.setBackground(new Color(47,8,85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario usuario = new Usuario();
				usuario.setNombre(txtUser.getText());
				usuario.setContrasenia(txtPassword.getText());
				
				System.out.println(txtUser.getText() + " " + txtPassword.getText());
				
				boolean existe = bd.iniciarSesion(usuario);
				
				if(existe) {
					Dashboard d=new Dashboard();
					d.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"No existe un usuario con esa contraseña en la base de datos.");
				}
			}
		});
		lblIniciar.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		lblIniciar.setForeground(Color.WHITE);
		lblIniciar.setBounds(0, 0, 103, 33);
		pnlIniciar.add(lblIniciar);
		
		JPanel pnlRegistrar = new JPanel();
		pnlRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		pnlRegistrar.setLayout(null);
		pnlRegistrar.setBackground(new Color(47, 8, 85));
		pnlRegistrar.setBounds(171, 333, 103, 33);
		contentPane.add(pnlRegistrar);
		pnlRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblRegistrar = new JLabel("Registrarse");
		lblRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pnlRegistrar.setBackground(new Color(47,8,85));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlRegistrar.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario usuario = new Usuario();
				usuario.setNombre(txtUser.getText());
				usuario.setContrasenia(txtPassword.getText());
				boolean existe = bd.registrar(usuario);
				
				if(existe) { 
					
					JOptionPane.showMessageDialog(null, "EL USUARIO ESTA REGISTRADO EN ESTA APP");
					
				} else {
					
					Dashboard dash = new Dashboard();
					dash.setVisible(true);
					setVisible(false);
					
				}
			}
		});
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setForeground(Color.WHITE);
		lblRegistrar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		lblRegistrar.setBounds(0, 0, 103, 33);
		pnlRegistrar.add(lblRegistrar);
		
		txtUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(txtUser.getText().equals("Usuario")) {
					txtUser.setText("");
					txtUser.setForeground(Color.black);
				}
				if(String.valueOf(txtPassword.getPassword()).isEmpty()){
					txtPassword.setText("Contraseña");
					txtPassword.setForeground(Color.darkGray);
				}
			}
		});
		
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String valorPass = new String(txtPassword.getPassword());
				if(valorPass.equals("Contraseña")) {
					txtPassword.setText("");
					txtPassword.setForeground(Color.black);
				}
				if(String.valueOf(txtUser.getText()).isEmpty()){
					txtUser.setText("Usuario");
					txtUser.setForeground(Color.darkGray);
				}
			}
		});
	}
}
