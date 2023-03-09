package igu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DeExtArg extends JPanel {

	private JRadioButton argDol, argEur, argLib, argYen, argWon;
	public JRadioButton getArgDol() {
		return argDol;
	}

	public JRadioButton getArgEur() {
		return argEur;
	}

	public JRadioButton getArgLib() {
		return argLib;
	}

	public JRadioButton getArgYen() {
		return argYen;
	}

	public JRadioButton getArgWon() {
		return argWon;
	}
	private ButtonGroup grupoDeArgExt;
	
	public DeExtArg() {
		
		panelTransparent();
		
		grupoDeArgExt = new ButtonGroup();
		
		argDol = new JRadioButton();
		argDol.setSelected(true);
		argDol.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argDol.setText("De Dólar a pesos ARG");
		argDol.setBounds(6,  7, 155, 23);
		
		argEur = new JRadioButton();
		argEur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argEur.setText("De Euros a pesos ARG");
		argEur.setBounds(6,  53, 157, 23);
		
		argLib = new JRadioButton();
		argLib.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argLib.setText("De Libras Esterlinas a pesos ARG");
		argLib.setBounds(6,  98, 223, 23);
		
		argYen = new JRadioButton();
		argYen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argYen.setText("De Yen Japonés a pesos ARG");
		argYen.setBounds(6,  145, 197, 23);
		
		argWon = new JRadioButton();
		argWon.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		argWon.setText("De Won sul-coreano a pesos ARG");
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
