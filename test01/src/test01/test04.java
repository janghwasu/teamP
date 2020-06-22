package test01;

public class test04 {
	public static void main(String[] args) {
		int input = 9;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int i) {
		if (i <= 1) {
			return i;

		} else

		{

			return fibo(i - 1) + fibo(i - 2);

		}
	}
}