package test01;

public class test02 {
	public static void main(String[] args) {
		// isDvide

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	private static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else if (num1 % num2 != 0)

			return false;
	}
}