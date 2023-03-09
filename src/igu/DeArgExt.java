package igu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DeArgExt extends JPanel {

	private JRadioButton argDol, argEur, argLib, argYen, argWon;
	private ButtonGroup grupoDeArgExt;
	
	public DeArgExt() {
		
		panelTransparent();
		
		grupoDeArgExt = new ButtonGroup();
		
		argDol = new JRadioButton();
		argDol.setSelected(true);
		argDol.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argDol.setText("De pesos ARG a Dólar");
		argDol.setBounds(6,  7, 155, 23);
		
		argEur = new JRadioButton();
		argEur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argEur.setText("De pesos ARG a Euros");
		argEur.setBounds(6,  53, 157, 23);
		
		argLib = new JRadioButton();
		argLib.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argLib.setText("De pesos ARG a Libras Esterlinas");
		argLib.setBounds(6,  98, 223, 23);
		
		argYen = new JRadioButton();
		argYen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argYen.setText("De pesos ARG a Yen Japonés");
		argYen.setBounds(6,  145, 197, 23);
		
		argWon = new JRadioButton();
		argWon.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argWon.setText("De pesos ARG a Won sul-coreano");
		argWon.setBounds(6,  187, 223, 23);
		
		grupoDeArgExt.add(argDol);
		grupoDeArgExt.add(argEur);
		grupoDeArgExt.add(argLib);
		grupoDeArgExt.add(argYen);
		grupoDeArgExt.add(argWon);
		setLayout(null);
		
		add(argDol);
		add(argEur);
		add(argLib);
		add(argYen);
		add(argWon);
	}
	
	private void panelTransparent() {
		setBackground(new Color(0, 103, 218));
	}

}
