package java0617����;

public class Main { // View ����
	public static void main(String[] args) {
		// ���ް���
		SalaryCalculator calculator = new SalaryCalculator();

		int money = calculator.calculate(new TempEmployee("smhrd001", "Ȳ�ص�", 9000));
		System.out.println("�������� : " + money);
		money = calculator.calculate(new RegularEmployee("smhrd002", "ȫ�浿", 5000, 5000));
		System.out.println("������ : " + money);
		money = calculator.calculate(new PartTimeEmployee("snhrd003", "���嵶", 10, 10));
		System.out.println("�Ⱓ�� : " + money);
	}

}
