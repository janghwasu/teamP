package eaxm02;

import java.util.Scanner;

public class ���׿�����_���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : "); // ln �� �ٹٲ� ��ɾ�
		int num1 = sc.nextInt();

		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		// System.out.println("�� ���� �� : "+result);
		String str = String.format("%d�� %d�� ���� : %d", num1, num2, result);
		System.out.println(str);

	}

}
