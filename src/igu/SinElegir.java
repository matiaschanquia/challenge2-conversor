package igu;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SinElegir extends JPanel {

	/**
	 * Create the panel.
	 */
	public SinElegir() {
		panelTransparent();
		
		setLayout(null);
		JLabel labelSelect = new JLabel("Seleccione un conversor");
		labelSelect.setForeground(new Color(0, 0, 0));
		labelSelect.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		labelSelect.setHorizontalAlignment(SwingConstants.CENTER);
		labelSelect.setBounds(29, 110, 323, 53);
		add(labelSelect);
	}
	
	private void panelTransparent() {
		setBackground(new Color(0, 0, 0, 0));
	}

}
