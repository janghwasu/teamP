package java0609;

public class exam05_method {

	public static void main(String[] args) {
		// 2개 정수를 받아 10에 가까운수를 출력

		int num1 = -5;
		int num2 = -1;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수  : " + result);

	}

	public static int close10(int num1, int num2) {
		if ((Math.abs(num1 - 10)) == (Math.abs(num2 - 10))) {
			return 0;
		}

		int minus1 = Math.abs(num1 - 10);
		int minus2 = Math.abs(num2 - 10);

		int result = minus1 < minus2 ? num1 : num2;

		return result;
	}

}
