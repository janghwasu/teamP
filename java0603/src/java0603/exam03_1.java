package java0603;

import java.util.Scanner;

public class exam03_1 {

	public static void main(String[] args) {
		// ���ڸ� �Է¹޾� �����ϴ� ���α׷�, -1 �Է½� �ߴ�

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();

			sum += input; // sum = sum+input

			System.out.println("���� ��� : " + sum);
			if (input == -1) {
				System.out.println("�����մϴ�.");
				break;
			}
		}

	}

}
