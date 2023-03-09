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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultadoMonedas extends JPanel {
	private JTextField txtMonto;
	
	public JTextField getTxtMonto() {
		return txtMonto;
	}

	private JTextField txtResultado;

	/**
	 * Create the panel.
	 */
	public ResultadoMonedas() {
		this.setBackground(new Color(0, 128, 0));
		setLayout(null);
		
		MyButton myButtonConvertir = new MyButton();
		myButtonConvertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String res = Dashboard.obtenerResultadoMoneda(txtMonto.getText());
				
				txtResultado.setText(res);
			}
		});
		myButtonConvertir.setText("Convertir");
		myButtonConvertir.setBounds(58, 74, 98, 23);
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
		labelMonto.setBounds(10, 24, 103, 15);
		add(labelMonto);
		
		txtMonto = new JTextField();
		txtMonto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				validarMonto(e);
			}
		});
		txtMonto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		txtMonto.setBounds(10, 45, 146, 23);
		add(txtMonto);
		txtMonto.setColumns(10);
		
		JLabel labelComent = new JLabel("-Usar punto para decimales");
		labelComent.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		labelComent.setForeground(new Color(0, 0, 0));
		labelComent.setBounds(10, 108, 152, 14);
		add(labelComent);
		
		JLabel labelComent2 = new JLabel("-Max. 10 caracteres");
		labelComent2.setForeground(Color.BLACK);
		labelComent2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		labelComent2.setBounds(10, 126, 152, 14);
		add(labelComent2);
		
		JLabel labelResult = new JLabel("Resultado:");
		labelResult.setForeground(new Color(0, 0, 0));
		labelResult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		labelResult.setBounds(10, 151, 64, 15);
		add(labelResult);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		txtResultado.setBounds(10, 172, 146, 23);
		add(txtResultado);
		txtResultado.setColumns(10);
		txtMonto.requestFocus(true);
	}
	
	private void validarMonto(KeyEvent e) {
		int key = e.getKeyChar();

	    boolean numeros = (key >= 48 && key <= 57) || key == 46;
		
		if(txtMonto.getText().length() >= 10) {
	        e.consume();
	    }
		
		if(!numeros) {
			e.consume();
		}
		
		if(key == 46) {
			if(txtMonto.getText().contains(".")) {
				e.consume();
			}
		}
	}
}
