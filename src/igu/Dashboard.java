package igu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import button.MyButton;
import logica.DeArgExtCambio;
import logica.DeExtArgCambio;
import logica.DeMOtroConversor;
import logica.DeOtroMConversor;

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
import java.util.Random;
import java.awt.Window.Type;

public class Dashboard extends JFrame {

	private JPanel contentPane, panelContent;

	private MyButton myButtonMedidas, myButtonMonedas;
		
	private static Monedas monedas;
	
	private static Medidas medidas;
	
	private static int converSelec = 0;

	public Dashboard() {
		setUndecorated(true);
		setTitle("Conversor");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/img/logo-alura.png")));
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
				converSelec = 1;
				myButtonMonedas.setBorderColor(new Color(0, 0, 0, 0));
				myButtonMedidas.setBorderColor(new Color(0, 255, 232));
				repaint();
				medidas = new Medidas();
				cambiarPanel(medidas);
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
		
		JLabel labelSeparadorGral = new JLabel("");
		ImageIcon imageIconLinea = new ImageIcon(Dashboard.class.getResource("/img/bg-negro.jpg"));
		Image imageLinea = imageIconLinea.getImage();
		Image newImageLinea = imageLinea.getScaledInstance(387, 2, java.awt.Image.SCALE_SMOOTH);
		imageIconLinea = new ImageIcon(newImageLinea);
		labelSeparadorGral.setIcon(imageIconLinea);
		labelSeparadorGral.setBounds(0, 74, 387, 2);
		panelDashboard.add(labelSeparadorGral);
		
		panelContent = new JPanel();
		panelContent.setBounds(0, 77, 387, 302);
		panelContent.setBackground(new Color(0, 0, 0, 0));
		panelDashboard.add(panelContent);
		panelContent.setLayout(null);
		
		SinElegir sinElegir = new SinElegir();
		sinElegir.setSize(387, 302);
		sinElegir.setLocation(0, 0);
		panelContent.add(sinElegir);
		
		MyLabelLink myLabelLinkPort = new MyLabelLink("https://matiaschanquia.github.io/portafolio-v1/", "Matias Chanquia");
		myLabelLinkPort.setBounds(137, 280, 105, 16);
		sinElegir.add(myLabelLinkPort);
		myLabelLinkPort.setForeground(Color.BLACK);
		myLabelLinkPort.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		
		myButtonMedidas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		myButtonMedidas.setBorderColor(new Color(213, 213, 213, 0));
		myButtonMedidas.setLocation(204, 44);
		myButtonMedidas.setSize(153, 23);
		myButtonMedidas.setText("Conversor de Medida");
		panelDashboard.add(myButtonMedidas);
		
		myButtonMonedas = new MyButton();
		myButtonMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		myButtonMonedas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				converSelec = 0;
				myButtonMedidas.setBorderColor(new Color(0, 0, 0, 0));
				myButtonMonedas.setBorderColor(new Color(0, 255, 232));
				repaint();
				monedas = new Monedas();
				cambiarPanel(monedas);
				monedas.getResultadoMonedas().getTxtMonto().requestFocus();
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
	
	public static String obtenerResultado(String valor) {
		
		double monto;
		
		try {
			monto = Double.parseDouble(valor);
		} catch (Exception e) {
			return "Valor incorrecto";
		}
		
		if(converSelec == 0) {
			double resMonto = 0;
			String resMoneda = "Error";
			
			if(monedas.getArgExt().isSelected()) {
				if(monedas.getDeArgExt().getArgDol().isSelected()) {
					resMonto = Math.round((monto * DeArgExtCambio.getArgDol()) * 100.0) / 100.0;
					resMoneda = "Dólar";
				} else if(monedas.getDeArgExt().getArgEur().isSelected()) {
					resMonto = Math.round((monto * DeArgExtCambio.getArgEur()) * 100.0) / 100.0;
					resMoneda = "Euros";
				} else if(monedas.getDeArgExt().getArgLib().isSelected()) {
					resMonto = Math.round((monto * DeArgExtCambio.getArgLib()) * 100.0) / 100.0;
					resMoneda = "Libras Est.";
				} else if(monedas.getDeArgExt().getArgYen().isSelected()) {
					resMonto = Math.round((monto * DeArgExtCambio.getArgYen()) * 100.0) / 100.0;
					resMoneda = "Yen Jap.";
				} else {
					resMonto = Math.round((monto * DeArgExtCambio.getArgWon()) * 100.0) / 100.0;
					resMoneda = "Won sul.";
				}
			} else {
				if(monedas.getDeExtArg().getArgDol().isSelected()) {
					resMonto = Math.round((monto * DeExtArgCambio.getArgDol()) * 100.0) / 100.0;
				} else if(monedas.getDeExtArg().getArgEur().isSelected()) {
					resMonto = Math.round((monto * DeExtArgCambio.getArgEur()) * 100.0) / 100.0;
				} else if(monedas.getDeExtArg().getArgLib().isSelected()) {
					resMonto = Math.round((monto * DeExtArgCambio.getArgLib()) * 100.0) / 100.0;
				} else if(monedas.getDeExtArg().getArgYen().isSelected()) {
					resMonto = Math.round((monto * DeExtArgCambio.getArgYen()) * 100.0) / 100.0;
				} else {
					resMonto = Math.round((monto * DeExtArgCambio.getArgWon()) * 100.0) / 100.0;
				}
				resMoneda = "ARG";
			}
			
			return resMonto + " " + resMoneda;
		} else {
			double resMed = 0;
			String resUnidad = "Error";
			
			if(medidas.getMOtro().isSelected()) {
				if(medidas.getDeMOtro().getMKm().isSelected()) {
					resMed = Math.round((monto * DeMOtroConversor.getMKm()) * 10000.0) / 10000.0;
					resUnidad = "kilómetros";
				} else if(medidas.getDeMOtro().getMCm().isSelected()) {
					resMed = Math.round((monto * DeMOtroConversor.getMCm()) * 10000.0) / 10000.0;
					resUnidad = "centímetros";
				} else if(medidas.getDeMOtro().getMMm().isSelected()) {
					resMed = Math.round((monto * DeMOtroConversor.getMMm()) * 10000.0) / 10000.0;
					resUnidad = "milímetros";
				} else if(medidas.getDeMOtro().getMYar().isSelected()) {
					resMed = Math.round((monto * DeMOtroConversor.getMYar()) * 10000.0) / 10000.0;
					resUnidad = "yardas";
				} else {
					resMed = Math.round((monto * DeMOtroConversor.getMPul()) * 10000.0) / 10000.0;
					resUnidad = "pulgadas";
				}
			} else {
				if(medidas.getDeOtroM().getMKm().isSelected()) {
					resMed = Math.round((monto * DeOtroMConversor.getMKm()) * 10000.0) / 10000.0;
				} else if(medidas.getDeOtroM().getMCm().isSelected()) {
					resMed = Math.round((monto * DeOtroMConversor.getMCm()) * 10000.0) / 10000.0;
				} else if(medidas.getDeOtroM().getMMm().isSelected()) {
					resMed = Math.round((monto * DeOtroMConversor.getMMm()) * 10000.0) / 10000.0;
				} else if(medidas.getDeOtroM().getMYar().isSelected()) {
					resMed = Math.round((monto * DeOtroMConversor.getMYar()) * 10000.0) / 10000.0;
				} else {
					resMed = Math.round((monto * DeOtroMConversor.getMPul()) * 10000.0) / 10000.0;
				}
				resUnidad = "metros";
			}
			
			return resMed + " " + resUnidad;
		}
	}
}
