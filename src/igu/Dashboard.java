package igu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import button.MyButton;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JRadioButton;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/img/logo-alura.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBounds(0, 0, 387, 379);
		contentPane.add(panelDashboard);
		panelDashboard.setLayout(null);
		
		JLabel labelBg = new JLabel();
		ImageIcon imageIconBg = new ImageIcon(Dashboard.class.getResource("/img/bg-blue.jpg"));
		Image imageBg = imageIconBg.getImage();
		Image newImageBg = imageBg.getScaledInstance(722, 379, java.awt.Image.SCALE_SMOOTH);
		imageIconBg = new ImageIcon(newImageBg);
		
		MyButton myButtonExit = new MyButton();
		myButtonExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		myButtonExit.setColorOver(new Color(14, 6, 79));
		myButtonExit.setColorClick(new Color(14, 6, 79));
		myButtonExit.setColor(new Color(26, 1, 165));
		myButtonExit.setBackground(new Color(26, 1, 165));
		myButtonExit.setRadius(10);
		myButtonExit.setBorderColor(new Color(0, 0, 0));
		myButtonExit.setForeground(new Color(255, 255, 255));
		myButtonExit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		myButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(122, 40, 109, 23);
		panelDashboard.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setRequestFocusEnabled(false);
		rdbtnNewRadioButton.setRolloverEnabled(false);
		rdbtnNewRadioButton.setBounds(6, 40, 109, 23);
		panelDashboard.add(rdbtnNewRadioButton);
		myButtonExit.setLocation(302, 6);
		myButtonExit.setSize(80, 27);
		myButtonExit.setText("Cerrar");
		panelDashboard.add(myButtonExit);
		
		JLabel labelTitle = new JLabel("Conversor");
		labelTitle.setForeground(new Color(0, 0, 0));
		labelTitle.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		labelTitle.setBounds(122, 3, 153, 30);
		panelDashboard.add(labelTitle);
		labelBg.setIcon(imageIconBg);
		labelBg.setBounds(0, 0, 387, 379);
		panelDashboard.add(labelBg);
		
		JPanel panelContent = new JPanel();
		panelContent.setBounds(0, 77, 387, 302);
		panelDashboard.add(panelContent);
		panelContent.setLayout(null);
		
	}
}
