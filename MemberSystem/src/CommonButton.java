import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CommonButton {
	public void buttonMake(JFrame frame, JPanel panel) {
		JButton btnNewButton = new JButton("\uD648");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.disable();
				join.main(null);
			}
		});
		btnNewButton.setBounds(12, 26, 47, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uD0ED1");
		btnNewButton_1.setBounds(65, 26, 78, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(276, 26, 134, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\uC7A5\uBC14\uAD6C\uB2C8");
		btnNewButton_3.setBounds(155, 26, 116, 23);
		panel.add(btnNewButton_3);
	}
}
