package festival;

public class fes0610_4 {

	public static void main(String[] args) {
		// 정수형 변수 input을 선언하고
		// 피보나치 수열의 input번째 항까지 출력하시오.

		int input = 8;
		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	private static int fibo(int i) {
		if (i <= 1) {
			return i;

		} else {
			return fibo(i - 1) + fibo(i - 2);
		}
	}

}
