package festival;

public class fes0610_4 {

	public static void main(String[] args) {
		// ������ ���� input�� �����ϰ�
		// �Ǻ���ġ ������ input��° �ױ��� ����Ͻÿ�.

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
