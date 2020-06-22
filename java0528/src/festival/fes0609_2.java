package festival;

public class fes0609_2 {

	public static void main(String[] args) {
		// num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1과 num2를 op에 맞게 연산한 결과값을
		// 반환해주는 cal 메소드를 작성하세요.

		int num1 = 15;

		int num2 = 25;

		char op = '-';

		cal(num1, num2, op);

	}

	public static void cal(int num1, int num2, char op) {
		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			int result = num1 < num2 ? num2 - num1 : num1 - num2;
			System.out.println(result);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else if (op == '/') {
			System.out.println(num1 / num2);
		}

	}

}
