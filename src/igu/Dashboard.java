package igu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import button.MyButton;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane, panelContent;

	private MyButton myButtonMedidas, myButtonMonedas;
	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/img/logo-alura.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBounds(0, 0, 387, 379);
		contentPane.add(panelDashboard);
		panelDashboard.setLayout(null);
		
		JLabel labelBg = new JLabel();
		ImageIcon imageIconBg = new ImageIcon(Dashboard.class.getResource("/img/bg-blue.jpg"));
		Image imageBg = imageIconBg.getImage();
		Image newImageBg = imageBg.getScaledInstance(722, 379, java.awt.Image.SCALE_SMOOTH);
		imageIconBg = new ImageIcon(newImageBg);
		
		MyButton myButtonExit = new MyButton();
		myButtonExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myButtonExit.setColorOver(new Color(14, 6, 79));
		myButtonExit.setColorClick(new Color(14, 6, 79));
		myButtonExit.setColor(new Color(26, 1, 165));
		myButtonExit.setBackground(new Color(26, 1, 165));
		myButtonExit.setRadius(10);
		myButtonExit.setBorderColor(new Color(0, 0, 0));
		myButtonExit.setForeground(new Color(255, 255, 255));
		myButtonExit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		myButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		myButtonMedidas = new MyButton();
		myButtonMedidas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myButtonMonedas.setBorderColor(new Color(0, 0, 0, 0));
				myButtonMedidas.setBorderColor(new Color(0, 255, 232));
				repaint();
				cambiarPanel(new Medidas());
			}
		});
		myButtonMedidas.setColor(new Color(213, 213, 213));
		myButtonMedidas.setBackground(new Color(213, 213, 213));
		myButtonMedidas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myButtonMedidas.setColorClick(new Color(192, 192, 192));
		myButtonMedidas.setColorOver(new Color(192, 192, 192));
		myButtonMedidas.setForeground(new Color(0, 0, 0));
		myButtonMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		panelContent = new JPanel();
		panelContent.setBounds(0, 77, 387, 302);
		panelContent.setBackground(new Color(0, 0, 0, 0));
		panelDashboard.add(panelContent);
		panelContent.setLayout(null);
		
		
		MyLabelLink myLabelLinkPort = new MyLabelLink("https://matiaschanquia.github.io/portafolio-v1/", "Matias Chanquia");
		myLabelLinkPort.setForeground(new Color(0, 0, 0));
		myLabelLinkPort.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		myLabelLinkPort.setBounds(143, 280, 105, 16);
		panelContent.add(myLabelLinkPort);
		
		SinElegir sinElegir = new SinElegir();
		sinElegir.setSize(387, 302);
		sinElegir.setLocation(0, 0);
		panelContent.add(sinElegir);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(0, 77, 387, 2);
		panelDashboard.add(btnNewButton);
		
		myButtonMedidas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		myButtonMedidas.setBorderColor(new Color(213, 213, 213, 0));
		myButtonMedidas.setLocation(204, 44);
		myButtonMedidas.setSize(153, 23);
		myButtonMedidas.setText("Conversor de Medida");
		panelDashboard.add(myButtonMedidas);
		
		myButtonMonedas = new MyButton();
		myButtonMonedas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myButtonMedidas.setBorderColor(new Color(0, 0, 0, 0));
				myButtonMonedas.setBorderColor(new Color(0, 255, 232));
				repaint();
				cambiarPanel(new Monedas());
			}
		});
		myButtonMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		myButtonMonedas.setColor(new Color(213, 213, 213));
		myButtonMonedas.setBackground(new Color(213, 213, 213));
		myButtonMonedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myButtonMonedas.setColorClick(new Color(192, 192, 192));
		myButtonMonedas.setColorOver(new Color(192, 192, 192));
		myButtonMonedas.setForeground(new Color(0, 0, 0));
		myButtonMonedas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		myButtonMonedas.setBorderColor(new Color(213, 213, 213, 0));
		myButtonMonedas.setLocation(36, 43);
		myButtonMonedas.setSize(153, 23);
		myButtonMonedas.setText("Conversor de Moneda");
		panelDashboard.add(myButtonMonedas);
		myButtonExit.setLocation(302, 6);
		myButtonExit.setSize(80, 27);
		myButtonExit.setText("Cerrar");
		panelDashboard.add(myButtonExit);
		
		JLabel labelTitle = new JLabel("Conversor");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		labelTitle.setBounds(122, 3, 153, 30);
		panelDashboard.add(labelTitle);
		labelBg.setIcon(imageIconBg);
		labelBg.setBounds(0, 0, 387, 379);
		panelDashboard.add(labelBg);
	}
	
	public void cambiarPanel(JPanel p) {
		p.setSize(387, 302);
		p.setLocation(0, 0); 
		
		panelContent.removeAll();
		panelContent.add(p, BorderLayout.CENTER);
		panelContent.revalidate();
		panelContent.repaint();
	}
}
