package java0603;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// +,- ���� ���α׷� do-while��

		Scanner sc = new Scanner(System.in);
		String input4;

		do {
			System.out.print("ù ��° ���� �Է� >> ");
			int input1 = sc.nextInt();
			System.out.print("�� ��° ���� �Է� >> ");
			int input2 = sc.nextInt();
			System.out.print("[1]���ϱ� [2]���� >> ");
			int input3 = sc.nextInt();

			if (input3 == 1) {
				System.out.println("���ϱ� ���� ����� " + (input1 + input2));
			} else {
				System.out.println("���� ���� ����� " + (input1 - input2));
			}

			System.out.println("�ٽ� �����Ͻðڽ��ϱ�? (Y/N)");

			input4 = sc.next();

		} while (input4.equals("Y"));
		System.out.println("����");
	}
}
