package java0608;

import java.util.Random;

public class exam_01 {

	public static void main(String[] args) {
		// 1���� ������ �迭 ���� �� ���ǰ����� �ʱ�ȭ
		// Ȧ�� ���� ����� ����ϴ� ���α׷�

		int[] array = new int[10];
		Random ran = new Random();
		int odd = 0;

		// ������ array �� ������ �� �ֱ�

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				odd++;
			}
		}
		System.out.println("array�� �ִ� Ȧ���� ������ " + odd + "�� �Դϴ�.");

	}

}
