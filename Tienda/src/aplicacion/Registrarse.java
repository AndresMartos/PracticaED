package aplicacion;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Registrarse extends JPanel {
	private JTextField textField_1;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public Registrarse() {
		setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 450, 300);
		add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("EMPECEMOS!!");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(152, 0, 142, 39);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel etiquetaaliasusuario_1 = new JLabel("Nombre_usuario:");
		etiquetaaliasusuario_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetaaliasusuario_1.setBounds(35, 86, 112, 27);
		contentPane_1.add(etiquetaaliasusuario_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 89, 222, 20);
		contentPane_1.add(textField_1);
		
		JLabel etiquetacontraseña_1 = new JLabel("Contrase\u00F1a:");
		etiquetacontraseña_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		etiquetacontraseña_1.setBounds(35, 124, 112, 27);
		contentPane_1.add(etiquetacontraseña_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(125, 124, 222, 20);
		contentPane_1.add(passwordField_1);
		
		JCheckBox aceptarLOPD_1 = new JCheckBox("Aceptar Terminos y Condiciones sobre la LOPD");
		aceptarLOPD_1.setBounds(35, 158, 312, 23);
		contentPane_1.add(aceptarLOPD_1);
		
		JButton btnCrear_1 = new JButton("Crear");
		btnCrear_1.setBounds(294, 215, 89, 23);
		contentPane_1.add(btnCrear_1);
		
		JButton btnVolver_1 = new JButton("Volver");
		btnVolver_1.setBounds(181, 215, 89, 23);
		contentPane_1.add(btnVolver_1);

	}
}
