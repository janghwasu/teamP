package java0609;

public class exam07_overloading {

	public static void main(String[] args) {

		System.out.println(getsum(7));

	}

	private static int getsum(int i) {

		int result = 0;

		for (int j = 1; j < i; j++) {

			if (i % j == 0) {
				result += j;
			}

		}

		return result;
	}

}
