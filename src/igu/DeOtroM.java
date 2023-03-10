package igu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DeOtroM extends JPanel {

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

	private ButtonGroup grupoDeOtroM;
	
	public DeOtroM() {
		
		panelTransparent();
		
		grupoDeOtroM = new ButtonGroup();
		
		mKm = new JRadioButton();
		mKm.setSelected(true);
		mKm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mKm.setText("De kilómetro a metro");
		mKm.setBounds(6,  7, 137, 23);
		
		mCm = new JRadioButton();
		mCm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mCm.setText("De centímetro a metro");
		mCm.setBounds(6,  53, 145, 23);
		
		mMm = new JRadioButton();
		mMm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mMm.setText("De milímetro a metro");
		mMm.setBounds(6,  98, 137, 23);
		
		mYar = new JRadioButton();
		mYar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mYar.setText("De yarda a metro");
		mYar.setBounds(6,  145, 119, 23);
		
		mPul = new JRadioButton();
		mPul.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		mPul.setText("De pulgada a metro");
		mPul.setBounds(6,  187, 131, 23);
		
		grupoDeOtroM.add(mKm);
		grupoDeOtroM.add(mCm);
		grupoDeOtroM.add(mMm);
		grupoDeOtroM.add(mYar);
		grupoDeOtroM.add(mPul);
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
