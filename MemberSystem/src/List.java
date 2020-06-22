import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;

public class List {

	private JFrame frame;
	private MemberDAO dao = new MemberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
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
	public List() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 464);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		DefaultListModel<String>model = new DefaultListModel<String>();
		ArrayList<MemberVO> members = dao.selectAll();
		
		// member��� ArrayList�� ����ִ� ���߿� �̸��� ������ �ͼ� model�� �߰�
		for (int i = 0; i < members.size(); i++) {
			model.addElement(members.get(i).getName());
			
			
		}
		
		JList list = new JList(model);
		list.setBounds(0, 438, 410, -431);
		panel.add(list);
	}
}
