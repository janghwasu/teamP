package java_����;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = { "�ȴ���", "�ڼ���", "�輱��", "��ȭ��" };
		System.out.print("�˻� �� �̸��� �Է��ϼ���. >> ");
		String name = sc.next();
		sc.close();

//		boolean ch = false; // boolean ������ ���� ������ ���͸�
		int i = 0;
		for (i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(name + "���� " + (i + 1) + "�� ° �ε����� ����Ǿ� �ֽ��ϴ�.");
				break;
//				ch = !ch;

			}
		}
		if (i == names.length) {
			System.out.println(name + "�� �������� �ʽ��ϴ�.");
		}

//		if (!ch) {
//			System.out.println(name + "�� �������� �ʽ��ϴ�.");
//		}
	}
}