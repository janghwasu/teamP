package exam03;

import java.util.Scanner;

public class _3�ǹ��_5�ǹ�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			// String str = String.format("%d�� 3�� 5�� ����Դϴ�.", num);
			System.out.println(num + "�� 3�� 5�� ����Դϴ�.");
		} else if (num % 5 == 0) {
			System.out.println(num + "�� 5�� ����Դϴ�.");
		} else if (num % 3 == 0) {
			System.out.println(num + "�� 3�� ����Դϴ�.");
		} else {
			System.out.println(num + "�� 3�� 5�� ����� �ƴմϴ�.");
		}
	}

}


