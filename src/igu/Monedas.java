package igu;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Monedas extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JRadioButton argExt, extArg;
	private ButtonGroup grupoDeCambio;
	
	public Monedas() {
		panelTransparent();
		setLayout(null);
		
		grupoDeCambio = new ButtonGroup();
		
		argExt = new JRadioButton();
		argExt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		argExt.setText("De pesos ARG a extranjera");
		argExt.setBounds(6,  28, 183, 23);
		// argExt.setBackground(new Color(0, 0, 0, 0));
		
		extArg = new JRadioButton();
		extArg.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		extArg.setText("De extranjera a pesos ARG");
		extArg.setBounds(198,  28, 183, 23);
		// extArg.setBackground(new Color(0, 0, 0, 0));
		
		grupoDeCambio.add(argExt);
		grupoDeCambio.add(extArg);
		
		JLabel labelTitle = new JLabel("Conversor de Moneda");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		labelTitle.setBounds(109, 7, 182, 21);
		add(labelTitle);
		
		add(argExt);
		add(extArg);
	}
	
	private void panelTransparent() {
		this.setBackground(new Color(0, 0, 0, 0));
	}
}
