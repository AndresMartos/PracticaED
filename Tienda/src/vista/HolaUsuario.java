package vista;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


/**
 * 
 * @author Diego, Carlos y Andrés
 *
 */
public class HolaUsuario extends JPanel {

	/**
	 * Crea el Panel.
	 */
	public HolaUsuario() {
		setBackground(new Color(154,85,204));
		setLayout(null);
		
		Ventana v = new Ventana();
		
		JLabel lblNewLabel = new JLabel("Bienvenido " + v.usuario());
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblNewLabel.setBounds(155, 145, 311, 150);
		add(lblNewLabel);
		
		ImageIcon imageIcon = new ImageIcon(Ventana.class.getResource("/Images/vida++.png")); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(148, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);
		
		JLabel lblimg = new JLabel("");
		lblimg.setIcon(imageIcon);
		lblimg.setBounds(10, 11, 148, 80);
		add(lblimg);
		
	}
}
