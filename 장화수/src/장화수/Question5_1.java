package ��ȭ��;

public class Question5_1 {

	public static void main(String[] args) {
		// 1-2+3-2+......+99-100 ����Ͽ� �� ���

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");

			} else {
				System.out.print(-i + " ");

			}

		}

	}

}
