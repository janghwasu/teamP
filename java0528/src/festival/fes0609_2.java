package festival;

public class fes0609_2 {

	public static void main(String[] args) {
		// num1, num2, op (+, -, *, /) �� �Ű������� �޾� num1�� num2�� op�� �°� ������ �������
		// ��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���.

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
