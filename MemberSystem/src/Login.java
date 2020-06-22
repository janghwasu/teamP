import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txt_ID;
	private JPasswordField txt_PW;
	MemberDAO dao = new MemberDAO();
	String name;
	private JButton btn_delete;
	private CommonButton cb = new CommonButton();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		lblNewLabel.setBounds(52, 104, 47, 37);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setBounds(52, 151, 47, 39);
		panel.add(lblNewLabel_1);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				MemberVO vo = new MemberVO(id, pw);
				name = dao.login(vo);
				if (name != null) { // 로그인 성공시

					JOptionPane.showMessageDialog(null, name + "님 환영합니다.");
					btn_delete.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}

			}
		});
		
		btn_login.setBounds(65, 318, 287, 59);
		panel.add(btn_login);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				join.main(null);

			}
		});
		btn_join.setBounds(65, 387, 287, 59);
		panel.add(btn_join);

		txt_ID = new JTextField();
		txt_ID.setBounds(88, 104, 264, 37);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(88, 151, 264, 39);
		panel.add(txt_PW);

		btn_delete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 창을 닫고 delete 클래스로 넘어감
				frame.dispose();
				Delete.main(null);
			}
		});
		btn_delete.setBounds(65, 456, 287, 59);
		panel.add(btn_delete);
		
		
		btn_delete.setVisible(false); // 앞에 있는 컴포넌트가 시각화가 가능한지 유무를 결정하는 메소드

		cb.buttonMake(frame, panel);
		
	}
}
