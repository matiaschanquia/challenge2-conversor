package igu;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Medidas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Medidas() {
		panelTransparent();
	}

	private void panelTransparent() {
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		JLabel labelTitle = new JLabel("Conversor de Medida");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		labelTitle.setBounds(109, 3, 176, 21);
		add(labelTitle);
		
		MyLabelLink myLabelLinkPort = new MyLabelLink("https://matiaschanquia.github.io/portafolio-v1/", "Matias Chanquia");
		myLabelLinkPort.setBounds(137, 280, 105, 16);
		add(myLabelLinkPort);
		myLabelLinkPort.setForeground(Color.BLACK);
		myLabelLinkPort.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
	}

}
