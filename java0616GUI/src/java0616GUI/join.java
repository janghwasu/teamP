package java0616GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class join {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_Name;
	private JTextField txt_Age;
	private JPasswordField txt_PW;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					join window = new join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 410, 521);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785 \uCC3D");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 51, 240, 69);
		panel.add(lblNewLabel);

		txt_ID = new JTextField();
		txt_ID.setBounds(85, 157, 240, 33);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_Name = new JTextField();
		txt_Name.setBounds(85, 239, 240, 33);
		panel.add(txt_Name);
		txt_Name.setColumns(10);

		txt_Age = new JTextField();
		txt_Age.setBounds(85, 282, 240, 33);
		panel.add(txt_Age);
		txt_Age.setColumns(10);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				String name = txt_Name.getText();
				int age = Integer.parseInt(txt_Age.getText());
//				VO vo = new VO(id, pw, name, age);
				list.add(new VO(id, pw, name, age));
				frame.dispose();
				Login.main(null);

			}
		});
		btn_join.setBounds(146, 415, 105, 33);
		panel.add(btn_join);

		JLabel lbl_ID = new JLabel("ID");
		lbl_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ID.setBounds(16, 166, 57, 15);
		panel.add(lbl_ID);

		JLabel lbl_PW = new JLabel("PW");
		lbl_PW.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_PW.setBounds(16, 206, 57, 15);
		panel.add(lbl_PW);

		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Name.setBounds(16, 248, 57, 15);
		panel.add(lbl_Name);

		JLabel lbl_Age = new JLabel("Age");
		lbl_Age.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Age.setBounds(16, 291, 57, 15);
		panel.add(lbl_Age);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(85, 200, 241, 29);
		panel.add(txt_PW);
	}

}
