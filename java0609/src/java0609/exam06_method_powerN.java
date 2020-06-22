package java0609;

public class exam06_method_powerN {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {

			result *= base;

		}
		return result;

	}

}
