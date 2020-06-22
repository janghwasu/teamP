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

		// 그래프의 값과 정보를 기억하고 있는 객체를 생성
		// 바차트
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

		// 파이차트
		// key와 value만 있으면 됨
		DefaultPieDataset dataset2 = new DefaultPieDataset();

		// 1.크기 2.범례 3.x축

		for (int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getUsage(), list.get(i).getMonth(), list.get(i).getDivision());
			dataset2.setValue(list.get(i).getDivision(), list.get(i).getUsage());

		}

//		dataset1.addValue(20, "test", "사과");
//		dataset1.addValue(40, "test", "바나나");
//		dataset1.addValue(50, "test", "오렌지");
//		dataset1.addValue(20, "test", "복숭아");
//		dataset1.addValue(50, "result", "파인애플");
//		dataset1.addValue(20, "result", "a");
//		dataset1.addValue(20, "result", "b");
//		dataset1.addValue(50, "result", "c");
//		dataset1.addValue(30, "result", "d");

		// 그래프를 그리는 객체 생성
		// 1.제목 2.x축 설명 3.y축 설명 4.그래프데이터 5.그래프종류(상하 또는 좌우) 6.범례사용여부 (t/f) 7.툴팁 사용여부(t/f)
		// 8.확대기능사용여부(t/f)

		JFreeChart barChart = ChartFactory.createBarChart("기간별사용량", "구분", "사용량", dataset1, PlotOrientation.HORIZONTAL,
				true, true, true);

		JFreeChart pieChart = ChartFactory.createPieChart("기간별사용량", dataset2, false, true, true);

		// createBarChart 에서 createAreaChart로 바꾸는 법
//		JFreeChart barChart = ChartFactory.createAreaChart("과일판매량", "종류", "판매수", dataset1, PlotOrientation.HORIZONTAL,
//				true, true, true);

		// 한글 인코딩, 한글 글씨체를 저장할 객체 생성
		// 1.폰트종류 2.폰트스타일 3.크기
		Font f = new Font("Gulim", Font.BOLD, 14);

		// 그래프 제목에 한글 적용
		barChart.getTitle().setFont(f);
		pieChart.getTitle().setFont(f);

		// x축 y축 한글적용
		CategoryPlot plot1 = barChart.getCategoryPlot();
		// x축 한글
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		
		

		// y축 한글
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		
		PiePlot plot2 = (PiePlot)pieChart.getPlot();
		plot2.setLabelFont(f);
		

		// 그려진 그래프를 차트 패널에 올리기
		ChartPanel chartPanel = new ChartPanel(barChart);
		ChartPanel chartPanel_1 = new ChartPanel(pieChart);

		// 그래프 크기 조절
		// 너비, 높이
//		chartPanel.setPreferredSize(new java.awt.Dimension(300, 500));
//		panel.add(chartPanel);
		panel.add(chartPanel_1);

	}

}
