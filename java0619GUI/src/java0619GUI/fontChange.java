package java0619GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class fontChange {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_PW;
	private FontMake fm = new FontMake();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fontChange window = new fontChange();
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
	public fontChange() {
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

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.fontChange(ge);
		String fonts[] = ge.getAvailableFontFamilyNames();

		for (int i = 0; i < fonts.length; i++) {
			System.out.println(fonts[i]);
		}


		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_ID = new JTextField();
		txt_ID.setBounds(57, 82, 314, 52);
		panel.add(txt_ID);
		txt_ID.setColumns(10);
		txt_ID.setOpaque(false); // 텍스트 필드의 투명도 부여하는 기능
		txt_ID.setBorder(null); // 텍스트 필드의 선을 없애는 기능
		

		txt_PW = new JTextField();
		txt_PW.setColumns(10);
		txt_PW.setBounds(57, 178, 314, 52);
		panel.add(txt_PW);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setFont(new Font("G마켓 산스 Bold", Font.PLAIN, 17));
		btn_login.setBounds(57, 283, 314, 52);
		panel.add(btn_login);

		JButton btn_delete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_delete.setFont(new Font("G마켓 산스 Bold", Font.PLAIN, 17));
		btn_delete.setBounds(57, 379, 314, 52);
		panel.add(btn_delete);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("G마켓 산스 Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(5, 100, 28, 15);
		panel.add(lblNewLabel);

		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setFont(new Font("G마켓 산스 Bold", Font.PLAIN, 16));
		lblPw.setBounds(5, 195, 40, 15);
		panel.add(lblPw);

		JLabel lblNewLabel_2 = new JLabel("\uB85C\uADF8\uC778 \uC2DC\uC2A4\uD15C");
		lblNewLabel_2.setFont(new Font("G마켓 산스 Bold", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(58, 20, 286, 52);
		panel.add(lblNewLabel_2);
	}
}
