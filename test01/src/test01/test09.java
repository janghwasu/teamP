package test01;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵ �Է� >>");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}
	}
}
