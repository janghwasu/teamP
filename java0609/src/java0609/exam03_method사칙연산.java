package java0609;

public class exam03_method��Ģ���� {

	public static void main(String[] args) {
		// ��Ģ����޼ҵ�

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void sub(int num1, int num2) {
		if (num1 < num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
			
			// ���׿����� int result = num1>num2 ? num1-num2:num2-num1;

		}
		System.out.println(num1 - num2);
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}

}
