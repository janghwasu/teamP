package festival;

import java.util.Random;

public class fes0604_2 {

	public static void main(String[] args) {
		// �ߺ��� ���� ���ڸ� �̴� �ζ� ���α׷��� ����ÿ�
		Random ran = new Random();
		int[] li = new int[8];

		li[0] = ran.nextInt(45) + 1;

		for (int i = 0; i <= 7; i++) {

			li[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {

				if (li[i] == li[j]) {
					i--;
				}

			}

		}

		for (int b = 0; b < 7; b++) {

			System.out.println("����Ǽ��� : " + li[b]);
		}

	}
}
