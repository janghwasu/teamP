package java0603;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		while (true) {

			System.out.print("���� �Է�  :");
			int num = sc.nextInt();

			num1 = num1 + num;

			System.out.println("������� : " + num1);

			if (num == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;

			}

		}

	}

}
