package java0616GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JToolBar;
import javax.swing.JTree;

public class components {

	private JFrame frame;
	private JTextField txt_name;
	private JRadioButton rd_man;
	private JRadioButton rd_woman;
	private int R, G, B = 50; // 전역변수에서는 한번에 가능
	private JButton btn_color;
	private JTable table;
	// private int G = 50;
	// private int B = 50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					components window = new components();
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
	public components() {
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

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("화면1", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC774    \uB984");
		lblNewLabel.setBounds(28, 76, 57, 15);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC131    \uBCC4");
		lblNewLabel_1.setBounds(28, 166, 57, 15);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uCDE8    \uBBF8");
		lblNewLabel_2.setBounds(28, 281, 57, 15);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uC870    \uD569");
		lblNewLabel_3.setBounds(28, 384, 57, 15);
		panel.add(lblNewLabel_3);

		rd_man = new JRadioButton("\uB0A8");
		rd_man.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (rd_man.isSelected()) {

					// 팝업창 띄우기
					JOptionPane.showMessageDialog(null, rd_man.getText(), "성별", JOptionPane.YES_NO_CANCEL_OPTION);
				}

			}
		});
		rd_man.setBounds(119, 162, 57, 23);
		panel.add(rd_man);

		// 버튼 그룹화 하기 위해 지역 변수에서 전역 변수로 변경
		rd_woman = new JRadioButton("\uC5EC");
		rd_woman.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		rd_woman.setBounds(240, 162, 72, 23);
		panel.add(rd_woman);

		// 라디오 버튼 둘중 하나만 선택 할 수 있도록 버튼을 그룹화
		ButtonGroup group = new ButtonGroup();
		group.add(rd_man);
		group.add(rd_woman);

		JCheckBox ch_coding = new JCheckBox("\uCF54\uB529");
		ch_coding.setBounds(119, 277, 57, 23);
		panel.add(ch_coding);

		JCheckBox ch_movie = new JCheckBox("\uC601\uD654");
		ch_movie.setBounds(199, 277, 57, 23);
		panel.add(ch_movie);

		JCheckBox ch_book = new JCheckBox("\uB3C5\uC11C");
		ch_book.setBounds(282, 277, 115, 23);
		panel.add(ch_book);

		txt_name = new JTextField();
		txt_name.setBounds(119, 73, 261, 21);
		panel.add(txt_name);
		txt_name.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(comboBox.getSelectedItem());
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uCE58\uD0A8 + \uB9E5\uC8FC",
				"\uCE58\uD0A8 + \uC18C\uC8FC", "\uD53C\uC790 + \uB9E5\uC8FC", "\uD53C\uC790 + \uC18C\uC8FC" }));
		comboBox.setToolTipText("\u3141\u3147\u3141\u3134\u3147");
		comboBox.setBounds(126, 380, 109, 23);
		panel.add(comboBox);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(119, 419, 261, 91);
		panel.add(editorPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("화면2", null, panel_1, null);
		panel_1.setLayout(null);

		btn_color = new JButton("\uC0C9\uC0C1 \uBCC0\uACBD");
		btn_color.setFont(new Font("굴림", Font.BOLD, 12));
		btn_color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_color.setBounds(117, 425, 213, 48);
		panel_1.add(btn_color);

		JSlider slider1 = new JSlider();
		slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) { // 움직일때마다 변경 change의 stateChanged
				R = slider1.getValue();
				btn_color.setBackground(new Color(R, G, B));

			}
		});
		slider1.setSnapToTicks(true);
		slider1.setPaintLabels(true);
		slider1.setPaintTicks(true);
		slider1.setMinorTickSpacing(10);
		slider1.setMajorTickSpacing(50);
		slider1.setMaximum(255);
		slider1.setForeground(Color.RED);
		slider1.setBounds(58, 58, 320, 48);
		panel_1.add(slider1);

		JSlider slider2 = new JSlider();
		slider2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				G = slider2.getValue();
				btn_color.setBackground(new Color(R, G, B));

			}
		});
		slider2.setMinorTickSpacing(10);
		slider2.setMajorTickSpacing(50);
		slider2.setMaximum(255);
		slider2.setForeground(Color.GREEN);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.setBounds(58, 173, 320, 48);
		panel_1.add(slider2);

		JSlider slider3 = new JSlider();
		slider3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				B = slider3.getValue();
				btn_color.setBackground(new Color(R, G, B));

			}
		});
		slider3.setMinorTickSpacing(10);
		slider3.setMajorTickSpacing(50);
		slider3.setMaximum(255);
		slider3.setForeground(Color.BLUE);
		slider3.setPaintTicks(true);
		slider3.setPaintLabels(true);
		slider3.setBounds(58, 311, 320, 48);
		panel_1.add(slider3);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("화면3", null, panel_2, null);

		String[] colNames = { "이름", "나이", "성별" }; // 컬럼명
		// 최상위 클래스 Object
		Object[][] data = { { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" }, { "김운비", 20, "여자" }, { "박병관", 20, "남자" }, { "김미희", 20, "여자" } }; // 데이터
		panel_2.setLayout(new CardLayout(0, 0));

		// JTable(데이터, 컬럼명)
		table = new JTable(data, colNames);
		panel_2.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel_2.add(scrollPane, "name_443405059933000");

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("화면4", null, panel_3, null);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JPanel panel_5 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_5, 97, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_5, 77, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_5, 287, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_5, 166, SpringLayout.WEST, panel_4);
		panel_4.add(panel_5);
		
		JToolBar toolBar = new JToolBar();
		panel_5.add(toolBar);
		
		JToolBar toolBar_1 = new JToolBar();
		sl_panel_4.putConstraint(SpringLayout.NORTH, toolBar_1, -23, SpringLayout.NORTH, panel_5);
		sl_panel_4.putConstraint(SpringLayout.WEST, toolBar_1, 32, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, toolBar_1, -6, SpringLayout.NORTH, panel_5);
		sl_panel_4.putConstraint(SpringLayout.EAST, toolBar_1, 237, SpringLayout.WEST, panel_4);
		panel_4.add(toolBar_1);
		
		JButton btnNewButton = new JButton("New button");
		sl_panel_4.putConstraint(SpringLayout.NORTH, btnNewButton, 48, SpringLayout.SOUTH, toolBar_1);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnNewButton, 13, SpringLayout.EAST, panel_5);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnNewButton, 133, SpringLayout.SOUTH, toolBar_1);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnNewButton, 126, SpringLayout.EAST, panel_5);
		panel_4.add(btnNewButton);
		
		JTree tree = new JTree();
		sl_panel_4.putConstraint(SpringLayout.NORTH, tree, 52, SpringLayout.SOUTH, panel_5);
		sl_panel_4.putConstraint(SpringLayout.WEST, tree, 27, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, tree, 192, SpringLayout.SOUTH, panel_5);
		sl_panel_4.putConstraint(SpringLayout.EAST, tree, 205, SpringLayout.WEST, panel_4);
		panel_4.add(tree);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_4.add(scrollPane_1);
	}
}
