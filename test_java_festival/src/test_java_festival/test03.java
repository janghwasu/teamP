package test_java_festival;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
//		0528_03
//		������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�����̶� 2���� 29���� �ִ� ���� ���Ѵ�.
//		4�� ����̸鼭 100�� ����� �ƴ� ���� �����̴�.
//		400�� ����� �� �����̴�.

		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵ �Է� >> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else if (year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("����ƴ�");
		}

	}
}