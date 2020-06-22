package java0616GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GoldKey {

	private JFrame frame;
	private JLabel lbl_count;
	private int num = 0;
	String[] arr = { "오지랖", "부활", "대리인", "꽝" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoldKey window = new GoldKey();
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
	public GoldKey() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 450, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("<<\uCC3E\uC544\uB77C \uD669\uAE08 \uC5F4\uC1E0...!>>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel.setBounds(72, 67, 332, 41);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uC624\uC9C0\uB796, \uBD80\uD65C, \uB300\uB9AC\uC778, \uAF5D");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(140, 137, 153, 23);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uACFC\uC5F0 \uB2F9\uC2E0\uC758 \uC6B4\uBA85\uC740...?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(140, 185, 153, 23);
		panel.add(lblNewLabel_2);

		JLabel lbl_goldkey = new JLabel("\uB79C\uB364");
		lbl_goldkey.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_goldkey.setBounds(192, 261, 57, 15);
		panel.add(lbl_goldkey);

		lbl_count = new JLabel("0");
		lbl_count.setBounds(347, 319, 57, 15);
		panel.add(lbl_count);

		JButton btn_click = new JButton("\uD074\uB9AD");
		btn_click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String btn_click = lbl_count.getText();
				num++;
				lbl_count.setText(num + ""); // Int형을 String으로 사용하기 위해 + "" 추가

				Random ran = new Random();

				int comment = ran.nextInt(arr.length);
				lbl_goldkey.setText(arr[comment]);

			}

		});
		btn_click.setBounds(118, 310, 217, 33);
		panel.add(btn_click);
		
		String path = "C:\\Users\\SMHRD\\java_workspace\\java0616GUI\\src\\icon\\goldkey.png";   // Image 파일 주소
		Image image = new ImageIcon(path).getImage();
		
		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(426, 421, Image.SCALE_SMOOTH)));   // 이미지 아이콘 생성 및 크기 조절
		lbl_image.setBounds(12, 10, 426, 421);
		panel.add(lbl_image);
	}
}
