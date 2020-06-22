package java0616GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txt_ID;
	private JPasswordField txt_PW;
	join join;
	private JButton btn_login;

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
		frame.setBounds(100, 100, 450, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 410, 520);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAD00\uB9AC\uC2DC\uC2A4\uD15C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����ü", Font.PLAIN, 18));
		lblNewLabel.setBounds(90, 35, 210, 60);
		panel.add(lblNewLabel);

		txt_ID = new JTextField();
		txt_ID.setBounds(115, 125, 170, 40);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(115, 180, 170, 40);
		panel.add(txt_PW);

		btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				// System.out.println("���̵� : " + id + "�н����� : " + pw);
				txt_ID.setText("");
				txt_PW.setText("");
				join.list.get(0); // join�� list�� �����ϴ� ���

				// ����ڰ� �Է��� Id, PW�� ������ �ͼ�
				// list ���ο� �ִ� Id, PW�� ��
				// ������ �α��� ����!
				// �ƴϸ� �α��� ����! ��� �ݼ�â ���
				boolean check = false;
				int index = 0;
				for (int i = 0; i < join.list.size(); i++) {
					if (id.equals(join.list.get(i).getId()) && pw.equals(join.list.get(i).getPw())) {
						// System.out.println("�α��� ����!"+join.list.get(i).getName()+"�� ȯ���մϴ�.");
						check = true;
						index = i;
					}

				}
				if (check) {
					// System.out.println("�α��� ����!" + join.list.get(index).getName() + "�� ȯ���մϴ�.");
					// JO ctrl+space�ϸ� �ذ� ���� ������, ó���� �θ�Ŭ���� ,null, ������ �޽���, ���̾�α� Ÿ��Ʋ, ������ ���
					JOptionPane.showMessageDialog(null, "�α��� ����!" + join.list.get(index).getName() + "�� ȯ���մϴ�.", "�α���",
							JOptionPane.WARNING_MESSAGE);

				} else {
					// System.out.println("�α��� ����!");
					JOptionPane.showMessageDialog(null, "�α��� ����!", "�α���", JOptionPane.ERROR_MESSAGE);

				}

			}
		});
		btn_login.setBounds(142, 338, 126, 26);
		panel.add(btn_login);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				join.main(null);

			}
		});
		btn_join.setBounds(142, 374, 126, 26);
		panel.add(btn_join);

		JLabel lb_ID = new JLabel("ID");
		lb_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_ID.setBounds(48, 141, 57, 15);
		panel.add(lb_ID);

		JLabel lb_PW = new JLabel("PW");
		lb_PW.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_PW.setBounds(48, 195, 57, 15);
		panel.add(lb_PW);
	}
}
