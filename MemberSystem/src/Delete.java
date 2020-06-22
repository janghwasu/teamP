import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_PW;
	private MemberDAO dao = new MemberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
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
	public Delete() {
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

		txt_ID = new JTextField();
		txt_ID.setBounds(79, 61, 278, 73);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JTextField();
		txt_PW.setColumns(10);
		txt_PW.setBounds(79, 186, 278, 73);
		panel.add(txt_PW);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(32, 88, 35, 15);
		panel.add(lblNewLabel);

		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(32, 213, 35, 15);
		panel.add(lblPw);

		JButton btn_delete = new JButton("\uD655\uC778");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_ID.getText();
				String pw = txt_PW.getText();

				int cnt = dao.delete(id, pw);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "Å»Åð¼º°ø");
					frame.dispose();
					Login.main(null);
				}

			}
		});
		btn_delete.setBounds(79, 414, 253, 57);
		panel.add(btn_delete);
	}

}
