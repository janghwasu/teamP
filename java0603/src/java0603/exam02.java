package java0603;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 10���� �������� ��� ���� �ޱ�

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("���� �Է�: ");
			int num = sc.nextInt();

			if (num > 10) {
				System.out.println("����Ǿ����ϴ�.");
				break;

			}
		}
	}
}
