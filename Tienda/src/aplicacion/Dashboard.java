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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(154,85,204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnCerrarSesion = new JPanel();
		pnCerrarSesion.setLayout(null);
		pnCerrarSesion.setBackground(new Color(47, 8, 85));
		pnCerrarSesion.setBounds(21, 407, 103, 33);
		contentPane.add(pnCerrarSesion);
		
		JLabel lblCerrarSesion = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesion.setBounds(0, 0, 103, 33);
		pnCerrarSesion.add(lblCerrarSesion);
		lblCerrarSesion.addMouseListener(new MouseAdapter() {
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
			}
		});
		lblCerrarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrarSesion.setForeground(Color.WHITE);
		lblCerrarSesion.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		
		JSeparator separator2 = new JSeparator();
		separator2.setOrientation(SwingConstants.VERTICAL);
		separator2.setForeground(Color.BLACK);
		separator2.setBackground(Color.BLACK);
		separator2.setBounds(148, 0, 2, 471);
		contentPane.add(separator2);
		
		JPanel pnComprar = new JPanel();
		pnComprar.setLayout(null);
		pnComprar.setBackground(new Color(47, 8, 85));
		pnComprar.setBounds(10, 270, 103, 33);
		contentPane.add(pnComprar);
		
		JLabel lblComprar = new JLabel("Comprar");
		lblComprar.addMouseListener(new MouseAdapter() {
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
			}
		});
		lblComprar.setBounds(0, 0, 103, 33);
		lblComprar.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprar.setForeground(Color.WHITE);
		lblComprar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		pnComprar.add(lblComprar);
		
		JPanel pnVender = new JPanel();
		pnVender.setLayout(null);
		pnVender.setBackground(new Color(47, 8, 85));
		pnVender.setBounds(10, 160, 103, 33);
		contentPane.add(pnVender);
		
		JLabel lblVender = new JLabel("Vender");
		lblVender.addMouseListener(new MouseAdapter() {
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
			}
		});
		lblVender.setBounds(0, 0, 103, 33);
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(Color.WHITE);
		lblVender.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 14));
		pnVender.add(lblVender);
		
		JSeparator separator2_2 = new JSeparator();
		separator2_2.setForeground(Color.BLACK);
		separator2_2.setBackground(Color.BLACK);
		separator2_2.setBounds(0, 394, 150, 2);
		contentPane.add(separator2_2);	
		
		JPanel content = new JPanel();
		content.setBounds(160, 0, 634, 471);
		content.setBackground(new Color(154,85,204));
		contentPane.add(content);
		
		Vender v = new Vender();
		v.setSize(646,471);
		v.setLocation(160,0);
		
		content.removeAll();
		content.add(v, BorderLayout.CENTER);
		content.revalidate();
		content.repaint();
		
	}
}
