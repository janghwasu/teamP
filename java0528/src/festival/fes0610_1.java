package festival;

public class fes0610_1 {

	public static void main(String[] args) {
		// startValue부터 endValue까지의 숫자 중 완전수를
		// 출력하는 getPerfectNumber()메소드를 구현하세요.

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	private static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");

		
		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {

					sum += j;
				}

			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}

	}

}
