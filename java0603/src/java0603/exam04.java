package java0603;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// ���� �Է� �� ¦�� Ȧ�� ���� ����, -1 �Է½� ����

		Scanner sc = new Scanner(System.in);

		int even = 0; // ¦��
		int odd = 0; // Ȧ��

		while (true) {

			System.out.print("���� �Է� : ");
			int input = sc.nextInt();

			if (input % 2 == 0) {
				even++;

			} else if (input % 2 == 1) {
				odd++;

			} else if (input == -1) {

				System.out.println("����Ǿ����ϴ�.");

				break;

			}
			System.out.println("¦������ : " + even);
			System.out.println("Ȧ������ : " + odd);
		}

	}

}
