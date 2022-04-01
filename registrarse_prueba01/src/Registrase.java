import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Registrase extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField nombreusuario;
	private JTextField correo;
	private JPasswordField contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrase frame = new Registrase();
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
	public Registrase() {
		setTitle("REGISTRAR NUEVO USUARIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPECEMOS!!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(152, 0, 142, 39);
		contentPane.add(lblNewLabel);
		
		JLabel etiquetanombre = new JLabel("Nombre:");
		etiquetanombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetanombre.setBounds(35, 48, 80, 27);
		contentPane.add(etiquetanombre);
		
		nombre = new JTextField();
		nombre.setBounds(125, 52, 222, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel etiquetaaliasusuario = new JLabel("Nombre_usuario:");
		etiquetaaliasusuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetaaliasusuario.setBounds(35, 86, 112, 27);
		contentPane.add(etiquetaaliasusuario);
		
		nombreusuario = new JTextField();
		nombreusuario.setColumns(10);
		nombreusuario.setBounds(125, 89, 222, 20);
		contentPane.add(nombreusuario);
		
		JLabel etiquetacorreo = new JLabel("Correo:");
		etiquetacorreo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetacorreo.setBounds(35, 124, 112, 27);
		contentPane.add(etiquetacorreo);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(125, 124, 222, 20);
		contentPane.add(correo);
		
		JRadioButton opcionvendedor = new JRadioButton("Vendedor");
		opcionvendedor.setBounds(147, 195, 109, 23);
		contentPane.add(opcionvendedor);
		
		JRadioButton opcioncliente = new JRadioButton("Cliente");
		opcioncliente.setBounds(258, 195, 109, 23);
		contentPane.add(opcioncliente);
		
		JLabel etiquetacuentacomo = new JLabel("Cuenta como:");
		etiquetacuentacomo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetacuentacomo.setBounds(35, 193, 112, 27);
		contentPane.add(etiquetacuentacomo);
		
		JLabel etiquetacontraseña = new JLabel("Contrase\u00F1a:");
		etiquetacontraseña.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetacontraseña.setBounds(35, 155, 112, 27);
		contentPane.add(etiquetacontraseña);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(125, 162, 222, 20);
		contentPane.add(contraseña);
		
		JCheckBox aceptarLOPD = new JCheckBox("Aceptar Terminos y Condiciones sobre la LOPD");
		aceptarLOPD.setBounds(35, 227, 312, 23);
		contentPane.add(aceptarLOPD);
	}
}
