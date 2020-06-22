import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import java0616GUI.Login;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class join {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_PW;
	private JTextField txt_NAME;
	private JTextField txt_AGE;
	private MemberDAO dao = new MemberDAO();

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
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblNewLabel.setBounds(27, 61, 36, 29);
		panel.add(lblNewLabel);

		txt_ID = new JTextField();
		txt_ID.setBounds(75, 58, 300, 48);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JTextField();
		txt_PW.setColumns(10);
		txt_PW.setBounds(75, 143, 300, 48);
		panel.add(txt_PW);

		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblPw.setBounds(27, 146, 36, 29);
		panel.add(lblPw);

		txt_NAME = new JTextField();
		txt_NAME.setColumns(10);
		txt_NAME.setBounds(75, 228, 300, 48);
		panel.add(txt_NAME);

		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblName.setBounds(12, 233, 59, 29);
		panel.add(lblName);

		txt_AGE = new JTextField();
		txt_AGE.setColumns(10);
		txt_AGE.setBounds(75, 310, 300, 48);
		panel.add(txt_AGE);

		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblAge.setBounds(27, 313, 36, 29);
		panel.add(lblAge);

		JButton btn_join = new JButton("\uC644\uB8CC");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				String name = txt_NAME.getText();
				int age = Integer.parseInt(txt_AGE.getText());

				int cnt = dao.join(new MemberVO(id, pw, name, age));
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "È¸¿ø°¡ÀÔ ¼º°ø!");
					frame.dispose(); // Ã¢´Ý´Â 2°¡Áö ¹æ¹ý : frame.setVisible(false);
					Login.main(null);

				}

			}
		});
		btn_join.setBounds(50, 385, 305, 55);
		panel.add(btn_join);
		
		JButton btn_return = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login.main(null);
			}
		});
		btn_return.setBounds(50, 461, 305, 55);
		panel.add(btn_return);
	}

}
