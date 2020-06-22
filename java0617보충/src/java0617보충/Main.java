package java0617보충;

public class Main { // View 역할
	public static void main(String[] args) {
		// 월급계산기
		SalaryCalculator calculator = new SalaryCalculator();

		int money = calculator.calculate(new TempEmployee("smhrd001", "황해도", 9000));
		System.out.println("비정규직 : " + money);
		money = calculator.calculate(new RegularEmployee("smhrd002", "홍길동", 5000, 5000));
		System.out.println("정규직 : " + money);
		money = calculator.calculate(new PartTimeEmployee("snhrd003", "김장독", 10, 10));
		System.out.println("기간제 : " + money);
	}

}
