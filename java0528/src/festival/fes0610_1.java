package festival;

public class fes0610_1 {

	public static void main(String[] args) {
		// startValue���� endValue������ ���� �� ��������
		// ����ϴ� getPerfectNumber()�޼ҵ带 �����ϼ���.

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	private static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "������ ������ : ");

		
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
