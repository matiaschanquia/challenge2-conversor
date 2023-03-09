package igu;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Monedas extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JRadioButton argExt, extArg;
	public JRadioButton getArgExt() {
		return argExt;
	}
	public JRadioButton getExtArg() {
		return extArg;
	}
	private ButtonGroup grupoDeCambio;
	private JPanel panelOpcionesMoneda;
	public JPanel getPanelOpcionesMoneda() {
		return panelOpcionesMoneda;
	}
	private DeArgExt deArgExt;
	public DeArgExt getDeArgExt() {
		return deArgExt;
	}
	private DeExtArg deExtArg;
	public DeExtArg getDeExtArg() {
		return deExtArg;
	}
	private JPanel panelResultado;
	private JLabel labelSeparador;
	private JLabel labelSeparador2;
	private ResultadoMonedas resultadoMonedas;
	
	public ResultadoMonedas getResultadoMonedas() {
		return resultadoMonedas;
	}

	public Monedas() {
		panelTransparent();
		setLayout(null);
		
		grupoDeCambio = new ButtonGroup();
		
		deExtArg = new DeExtArg();
		deExtArg.setBounds(110, 5, 1, 1);
		deExtArg.setSize(222, 222);
		deExtArg.setLocation(0, 0);
		
		argExt = new JRadioButton();
		argExt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actualizarOpciones(deArgExt);
			}
		});
		argExt.setSelected(true);
		argExt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		argExt.setText("De pesos ARG a extranjera");
		argExt.setBounds(6,  28, 183, 23);
		// argExt.setBackground(new Color(0, 0, 0, 0));
		
		extArg = new JRadioButton();
		extArg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actualizarOpciones2(deExtArg);
			}
		});
		extArg.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		extArg.setText("De extranjera a pesos ARG");
		extArg.setBounds(198,  28, 183, 23);
		// extArg.setBackground(new Color(0, 0, 0, 0));
		
		grupoDeCambio.add(argExt);
		grupoDeCambio.add(extArg);
		
		labelSeparador = new JLabel("");
		labelSeparador.setIcon(new ImageIcon(Monedas.class.getResource("/img/bg-negro.jpg")));
		labelSeparador.setBounds(0, 54, 387, 2);
		add(labelSeparador);
		
		panelResultado = new JPanel();
		panelResultado.setBounds(221, 56, 166, 222);
		panelResultado.setBackground(new Color(0, 0, 0, 0));
		add(panelResultado);
		panelResultado.setLayout(null);
		
		resultadoMonedas = new ResultadoMonedas();
		resultadoMonedas.setBounds(82, 5, 1, 1);
		resultadoMonedas.setSize(166, 222);
		resultadoMonedas.setLocation(0, 0);
		panelResultado.add(resultadoMonedas);
		
		labelSeparador2 = new JLabel("");
		ImageIcon imageIconLinea = new ImageIcon(Dashboard.class.getResource("/img/bg-negro.jpg"));
		Image imageLinea = imageIconLinea.getImage();
		Image newImageLinea = imageLinea.getScaledInstance(2, 222, java.awt.Image.SCALE_SMOOTH);
		imageIconLinea = new ImageIcon(newImageLinea);
		labelSeparador2.setIcon(imageIconLinea);
		labelSeparador2.setBounds(0, 0, 2, 222);
		resultadoMonedas.add(labelSeparador2);
		
		panelOpcionesMoneda = new JPanel();
		panelOpcionesMoneda.setBackground(new Color(0, 0, 0, 0));
		panelOpcionesMoneda.setBounds(0, 56, 222, 222);
		add(panelOpcionesMoneda);
		panelOpcionesMoneda.setLayout(null);
		
		deArgExt = new DeArgExt();
		deArgExt.setBounds(110, 5, 1, 1);
		deArgExt.setSize(222, 222);
		deArgExt.setLocation(0, 0);
		panelOpcionesMoneda.add(deArgExt);
		
		
		JLabel labelTitle = new JLabel("Conversor de Moneda");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		labelTitle.setBounds(109, 3, 182, 21);
		add(labelTitle);
		
		add(argExt);
		add(extArg);
		
		MyLabelLink myLabelLinkPort = new MyLabelLink("https://matiaschanquia.github.io/portafolio-v1/", "Matias Chanquia");
		myLabelLinkPort.setBounds(137, 280, 105, 16);
		add(myLabelLinkPort);
		myLabelLinkPort.setForeground(Color.BLACK);
		myLabelLinkPort.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		
	}
	
	private void actualizarOpciones(DeArgExt p) {
		panelOpcionesMoneda.removeAll();
		panelOpcionesMoneda.add(p, BorderLayout.CENTER);
		panelOpcionesMoneda.revalidate();
		panelOpcionesMoneda.repaint();
	}
	
	private void actualizarOpciones2(DeExtArg p) {
		panelOpcionesMoneda.removeAll();
		panelOpcionesMoneda.add(p, BorderLayout.CENTER);
		panelOpcionesMoneda.revalidate();
		panelOpcionesMoneda.repaint();
	}

	private void panelTransparent() {
		this.setBackground(new Color(0, 0, 0, 0));
	}
}
