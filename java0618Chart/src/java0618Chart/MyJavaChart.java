package java0618Chart;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JPanel;
import java.awt.Color;

public class MyJavaChart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJavaChart window = new MyJavaChart();
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
	public MyJavaChart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 901, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 731, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 875, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);

		ReadCSV readCSV = new ReadCSV();
		ArrayList<EnergyVO> list = readCSV.getList();

		// �׷����� ���� ������ ����ϰ� �ִ� ��ü�� ����
		// ����Ʈ
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

		// ������Ʈ
		// key�� value�� ������ ��
		DefaultPieDataset dataset2 = new DefaultPieDataset();

		// 1.ũ�� 2.���� 3.x��

		for (int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getUsage(), list.get(i).getMonth(), list.get(i).getDivision());
			dataset2.setValue(list.get(i).getDivision(), list.get(i).getUsage());

		}

//		dataset1.addValue(20, "test", "���");
//		dataset1.addValue(40, "test", "�ٳ���");
//		dataset1.addValue(50, "test", "������");
//		dataset1.addValue(20, "test", "������");
//		dataset1.addValue(50, "result", "���ξ���");
//		dataset1.addValue(20, "result", "a");
//		dataset1.addValue(20, "result", "b");
//		dataset1.addValue(50, "result", "c");
//		dataset1.addValue(30, "result", "d");

		// �׷����� �׸��� ��ü ����
		// 1.���� 2.x�� ���� 3.y�� ���� 4.�׷��������� 5.�׷�������(���� �Ǵ� �¿�) 6.���ʻ�뿩�� (t/f) 7.���� ��뿩��(t/f)
		// 8.Ȯ���ɻ�뿩��(t/f)

		JFreeChart barChart = ChartFactory.createBarChart("�Ⱓ����뷮", "����", "��뷮", dataset1, PlotOrientation.HORIZONTAL,
				true, true, true);

		JFreeChart pieChart = ChartFactory.createPieChart("�Ⱓ����뷮", dataset2, false, true, true);

		// createBarChart ���� createAreaChart�� �ٲٴ� ��
//		JFreeChart barChart = ChartFactory.createAreaChart("�����Ǹŷ�", "����", "�Ǹż�", dataset1, PlotOrientation.HORIZONTAL,
//				true, true, true);

		// �ѱ� ���ڵ�, �ѱ� �۾�ü�� ������ ��ü ����
		// 1.��Ʈ���� 2.��Ʈ��Ÿ�� 3.ũ��
		Font f = new Font("Gulim", Font.BOLD, 14);

		// �׷��� ���� �ѱ� ����
		barChart.getTitle().setFont(f);
		pieChart.getTitle().setFont(f);

		// x�� y�� �ѱ�����
		CategoryPlot plot1 = barChart.getCategoryPlot();
		// x�� �ѱ�
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		
		

		// y�� �ѱ�
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		
		PiePlot plot2 = (PiePlot)pieChart.getPlot();
		plot2.setLabelFont(f);
		

		// �׷��� �׷����� ��Ʈ �гο� �ø���
		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel_1 = new ChartPanel(pieChart);

		// �׷��� ũ�� ����
		// �ʺ�, ����
//		chartPanel.setPreferredSize(new java.awt.Dimension(300, 500));
//		panel.add(chartPanel);
		panel.add(chartPanel_1);

	}

}
