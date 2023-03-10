package igu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DeMOtro extends JPanel {

	private JRadioButton mKm, mCm, mMm, mYar, mPul;
	public JRadioButton getMKm() {
		return mKm;
	}

	public JRadioButton getMCm() {
		return mCm;
	}
	
	public JRadioButton getMMm() {
		return mMm;
	}

	public JRadioButton getMYar() {
		return mYar;
	}

	public JRadioButton getMPul() {
		return mPul;
	}

	private ButtonGroup grupoDeMOtro;
	
	public DeMOtro() {
		
		panelTransparent();
		
		grupoDeMOtro = new ButtonGroup();
		
		mKm = new JRadioButton();
		mKm.setSelected(true);
		mKm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mKm.setText("De metro a kilómetro");
		mKm.setBounds(6,  7, 137, 23);
		
		mCm = new JRadioButton();
		mCm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mCm.setText("De metro a centímetro");
		mCm.setBounds(6,  53, 145, 23);
		
		mMm = new JRadioButton();
		mMm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mMm.setText("De metro a milímetro");
		mMm.setBounds(6,  98, 145, 23);
		
		mYar = new JRadioButton();
		mYar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mYar.setText("De metro a yarda");
		mYar.setBounds(6,  145, 119, 23);
		
		mPul = new JRadioButton();
		mPul.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mPul.setText("De metro a pulgada");
		mPul.setBounds(6,  187, 131, 23);
		
		grupoDeMOtro.add(mKm);
		grupoDeMOtro.add(mCm);
		grupoDeMOtro.add(mMm);
		grupoDeMOtro.add(mYar);
		grupoDeMOtro.add(mPul);
		setLayout(null);
		
		add(mKm);
		add(mCm);
		add(mMm);
		add(mYar);
		add(mPul);
	}
	
	private void panelTransparent() {
		setBackground(new Color(0, 103, 218));
	}

}
