package java0603;

import java.util.Scanner;

public class exam05_1 {

	public static void main(String[] args) {
		// ���� ���α׷� while��

		Scanner sc = new Scanner(System.in);
		String input;

		while (true) {

			System.out.print("ù��° ���� �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� �Է� : ");
			int num2 = sc.nextInt();
			System.out.print("1���ϱ� 2���� : ");
			int num3 = sc.nextInt();

			if (num3 == 1) {
				System.out.println("���ϱ� ����� " + (num1 + num2));
			} else {
				System.out.println("���� ����� " + (num1 - num2));
			}

			System.out.println("�ٽ� ����? (Y/N)");
			input = sc.next();
			if (input.equals("N"))
				break;
		}

	}

}
