package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.awt.Toolkit;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel pnlCambia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/Images/bonsai.png")));	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(47, 8, 85));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnCerrarSesion = new JPanel();
		pnCerrarSesion.setBorder(null);
		pnCerrarSesion.setLayout(null);
		pnCerrarSesion.setBackground(new Color(47, 8, 85));
		pnCerrarSesion.setBounds(0, 398, 159, 65);
		contentPane.add(pnCerrarSesion);
		pnCerrarSesion.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblCerrarSesion = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesion.setBounds(0, 0, 159, 65);
		pnCerrarSesion.add(lblCerrarSesion);
		pnCerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnCerrarSesion.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnCerrarSesion.setBackground(new Color(47,8,85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Ventana v=new Ventana();
				v.setVisible(true);
				setVisible(false); 
			}
		});
		lblCerrarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrarSesion.setForeground(Color.WHITE);
		lblCerrarSesion.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		
		JPanel pnComprar = new JPanel();
		pnComprar.setBorder(null);
		pnComprar.setLayout(null);
		pnComprar.setBackground(new Color(47, 8, 85));
		pnComprar.setBounds(0, 63, 159, 54);
		contentPane.add(pnComprar);
		pnComprar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblComprar = new JLabel("Comprar");
		
		lblComprar.setBounds(0, 0, 159, 54);
		lblComprar.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprar.setForeground(Color.WHITE);
		lblComprar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		pnComprar.add(lblComprar);
		
		JPanel pnVender = new JPanel();
		pnVender.setBorder(null);
		pnVender.setLayout(null);
		pnVender.setBackground(new Color(47, 8, 85));
		pnVender.setBounds(0, 116, 159, 54);
		contentPane.add(pnVender);
		pnVender.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblVender = new JLabel("Vender");
		
		lblVender.setBounds(0, 0, 159, 54);
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(Color.WHITE);
		lblVender.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		pnVender.add(lblVender);
		
		pnlCambia = new JPanel();
		pnlCambia.setBounds(159, 0, 635, 471);
		contentPane.add(pnlCambia);
		pnlCambia.setLayout(new CardLayout(0, 0));
		pnlCambia.setBackground(new Color(154,85,204));
		
		HolaUsuario hola = new HolaUsuario();
		pnlCambia.add(hola);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 159, 65);
		contentPane.add(lblNewLabel);
		
		pnComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnComprar.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnComprar.setBackground(new Color(47,8,85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Compra comprar = new Compra();
				
				cambiar(comprar);
			}
		});
		
		pnVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnVender.setBackground(new Color(180,30,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnVender.setBackground(new Color(47,8,85));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Vender vender = new Vender();
				
				cambiar(vender);
			}
		});
		
	}
	
	public void cambiar(JPanel p) {
		pnlCambia.removeAll();
		pnlCambia.add(p);
		pnlCambia.revalidate();
		pnlCambia.repaint();
	}
}
