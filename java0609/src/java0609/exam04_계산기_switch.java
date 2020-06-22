package java0609;

public class exam04_°è»ê±â_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 15;

		int num2 = 25;

		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	private static int cal(int num1, int num2, char op) {

		switch (op) {
		case '-':
			return num1 > num2 ? num1 - num2 : num2 - num1;

		case '+':
			return num1 + num2;

		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;

		}
		return 0;

	}

}
