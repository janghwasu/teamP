package festival;

import java.util.Random;

public class fes0604_1 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� ��
		// ���� ū ���� ���� ���� ���� ����Ͻÿ�.

		Random ran = new Random();
		int[] li = new int[8];
		System.out.print("�迭�� �ִ� ��� �� : " + " ");

		for (int i = 0; i < 8; i++) {
			int rannum = ran.nextInt(100);
			li[i] = rannum;
			System.out.print(rannum + " ");

		}
		int max = li[0];
		int min = li[0];
		for (int j = 0; j < 8; j++) {

			if (max < li[j]) {
				max = li[j];
			}

		}
		for (int j = 0; j < 8; j++) {
			if (min > li[j]) {
				min = li[j];
			}

		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
	}

}
