package Figure;

public class Main {
	public static void main(String[] args) {
		// 도형넓이 계산 프로그램

		FigureCalculator figCal = new FigureCalculator();
		double result = figCal.calculator(new Rectangle(4, 5));
		double result2 = figCal.calculator(new Circle(50));
		double result3 = figCal.calculator(new Tri(4, 5));

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
