package exam04;

import java.util.Scanner;

public class Switch_test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;

		default:
			System.out.println("Ȧ���Դϴ�.");

		}

	}
}
