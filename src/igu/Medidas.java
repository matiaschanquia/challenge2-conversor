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

public class Medidas extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JRadioButton mOtro, otroM;
	public JRadioButton getMOtro() {
		return mOtro;
	}
	public JRadioButton getOtroM() {
		return otroM;
	}
	private ButtonGroup grupoDeTipoMedida;
	private JPanel panelOpcionesMedida;
	public JPanel getPanelOpcionesMoneda() {
		return panelOpcionesMedida;
	}
	private DeMOtro deMOtro;
	public DeMOtro getDeMOtro() {
		return deMOtro;
	}
	private DeOtroM deOtroM;
	public DeOtroM getDeOtroM() {
		return deOtroM;
	}
	private JPanel panelResultado;
	private JLabel labelSeparador;
	private JLabel labelSeparador2;
	private Resultado resultadoMedidas;
	
	public Resultado getResultadoMonedas() {
		return resultadoMedidas;
	}

	public Medidas() {
		panelTransparent();
		setLayout(null);
		
		grupoDeTipoMedida = new ButtonGroup();
		
		deOtroM = new DeOtroM();
		deOtroM.setBounds(110, 5, 1, 1);
		deOtroM.setSize(222, 222);
		deOtroM.setLocation(0, 0);
		
		mOtro = new JRadioButton();
		mOtro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actualizarOpciones(deMOtro);
			}
		});
		mOtro.setSelected(true);
		mOtro.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		mOtro.setText("De metro a otro");
		mOtro.setBounds(75,  28, 117, 23);
		// argExt.setBackground(new Color(0, 0, 0, 0));
		
		otroM = new JRadioButton();
		otroM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				actualizarOpciones2(deOtroM);
			}
		});
		otroM.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		otroM.setText("De otro a metro");
		otroM.setBounds(198,  28, 117, 23);
		// extArg.setBackground(new Color(0, 0, 0, 0));
		
		grupoDeTipoMedida.add(mOtro);
		grupoDeTipoMedida.add(otroM);
		
		labelSeparador = new JLabel("");
		labelSeparador.setIcon(new ImageIcon(Medidas.class.getResource("/img/bg-negro.jpg")));
		labelSeparador.setBounds(0, 54, 387, 2);
		add(labelSeparador);
		
		panelResultado = new JPanel();
		panelResultado.setBounds(221, 56, 166, 222);
		panelResultado.setBackground(new Color(0, 0, 0, 0));
		add(panelResultado);
		panelResultado.setLayout(null);
		
		resultadoMedidas = new Resultado();
		resultadoMedidas.setBounds(82, 5, 1, 1);
		resultadoMedidas.setSize(166, 222);
		resultadoMedidas.setLocation(0, 0);
		panelResultado.add(resultadoMedidas);
		
		labelSeparador2 = new JLabel("");
		ImageIcon imageIconLinea = new ImageIcon(Dashboard.class.getResource("/img/bg-negro.jpg"));
		Image imageLinea = imageIconLinea.getImage();
		Image newImageLinea = imageLinea.getScaledInstance(2, 222, java.awt.Image.SCALE_SMOOTH);
		imageIconLinea = new ImageIcon(newImageLinea);
		labelSeparador2.setIcon(imageIconLinea);
		labelSeparador2.setBounds(0, 0, 2, 222);
		resultadoMedidas.add(labelSeparador2);
		
		panelOpcionesMedida = new JPanel();
		panelOpcionesMedida.setBackground(new Color(0, 0, 0, 0));
		panelOpcionesMedida.setBounds(0, 56, 222, 222);
		add(panelOpcionesMedida);
		panelOpcionesMedida.setLayout(null);
		
		deMOtro = new DeMOtro();
		deMOtro.getMKm().setSize(137, 23);
		deMOtro.getMCm().setSize(145, 23);
		deMOtro.getMMm().setSize(131, 23);
		deMOtro.getMYar().setSize(119, 23);
		deMOtro.getMPul().setSize(137, 23);
		deMOtro.setBounds(110, 5, 1, 1);
		deMOtro.setSize(222, 222);
		deMOtro.setLocation(0, 0);
		panelOpcionesMedida.add(deMOtro);
		
		
		JLabel labelTitle = new JLabel("Conversor de Medida");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		labelTitle.setBounds(109, 3, 182, 21);
		add(labelTitle);
		
		add(mOtro);
		add(otroM);
		
		MyLabelLink myLabelLinkPort = new MyLabelLink("https://matiaschanquia.github.io/portafolio-v1/", "Matias Chanquia");
		myLabelLinkPort.setBounds(137, 280, 105, 16);
		add(myLabelLinkPort);
		myLabelLinkPort.setForeground(Color.BLACK);
		myLabelLinkPort.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		
	}
	
	private void actualizarOpciones(DeMOtro p) {
		panelOpcionesMedida.removeAll();
		panelOpcionesMedida.add(p, BorderLayout.CENTER);
		panelOpcionesMedida.revalidate();
		panelOpcionesMedida.repaint();
	}
	
	private void actualizarOpciones2(DeOtroM p) {
		panelOpcionesMedida.removeAll();
		panelOpcionesMedida.add(p, BorderLayout.CENTER);
		panelOpcionesMedida.revalidate();
		panelOpcionesMedida.repaint();
	}

	private void panelTransparent() {
		this.setBackground(new Color(0, 0, 0, 0));
	}
}
