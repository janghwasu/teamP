package festival;

import java.util.Scanner;

public class fes0604_3 {

	public static void main(String[] args) {
		// N�� X�� �Է� ���� �� N�� ���� �Է�, X���� �������� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >> ");
		int n = sc.nextInt(); // �Է� ��
		System.out.print("X �Է� >> ");
		int x = sc.nextInt(); // ���� ��

		int[] li = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.print((i + 1) + "��° ���� �Է� >> ");
			int num = sc.nextInt();
			li[i] = num;

		}
		System.out.print("��� : ");
		for (int i = 0; i < n; i++) {

			if (x > li[i]) {
				System.out.print(li[i]+" ");
			}
		}

	}

}
