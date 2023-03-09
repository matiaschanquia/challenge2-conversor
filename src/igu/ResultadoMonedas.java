package igu;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import button.MyButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResultadoMonedas extends JPanel {
	private JTextField txtMonto;
	private JTextField txtResultado;

	/**
	 * Create the panel.
	 */
	public ResultadoMonedas() {
		this.setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		MyButton myButtonConvertir = new MyButton();
		myButtonConvertir.setText("Convertir");
		myButtonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		myButtonConvertir.setBounds(58, 79, 98, 23);
		myButtonConvertir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myButtonConvertir.setColorOver(new Color(14, 6, 79));
		myButtonConvertir.setColorClick(new Color(14, 6, 79));
		myButtonConvertir.setColor(new Color(26, 1, 165));
		myButtonConvertir.setBackground(new Color(26, 1, 165));
		myButtonConvertir.setRadius(10);
		myButtonConvertir.setBorderColor(new Color(0, 0, 0));
		myButtonConvertir.setForeground(new Color(255, 255, 255));
		myButtonConvertir.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		add(myButtonConvertir);
		
		JLabel labelMonto = new JLabel("Ingrese el monto:");
		labelMonto.setForeground(new Color(0, 0, 0));
		labelMonto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		labelMonto.setBounds(10, 29, 103, 15);
		add(labelMonto);
		
		txtMonto = new JTextField();
		txtMonto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		txtMonto.setBounds(10, 50, 146, 23);
		add(txtMonto);
		txtMonto.setColumns(10);
		
		JLabel labelComent = new JLabel("- Usar coma");
		labelComent.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		labelComent.setForeground(new Color(0, 0, 0));
		labelComent.setBounds(10, 110, 65, 14);
		add(labelComent);
		
		JLabel labelResult = new JLabel("Resultado:");
		labelResult.setForeground(new Color(0, 0, 0));
		labelResult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		labelResult.setBounds(10, 142, 64, 15);
		add(labelResult);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		txtResultado.setBounds(10, 163, 146, 23);
		add(txtResultado);
		txtResultado.setColumns(10);
	}
}
