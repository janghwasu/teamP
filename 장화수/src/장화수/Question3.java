package ��ȭ��;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// ����� ���� ���� ��� ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.println("�ѱݾ� �Է� : ");
		int money = sc.nextInt();

		System.out.println("�ܵ� : " + money + "��");

		System.out.println("10000�� : " + (money / 10000) + "��");
		money = money - (money / 10000 * 10000);

		System.out.println("5000�� : " + (money / 5000) + "��");
		money = money - (money / 5000 * 5000);

		System.out.println("1000�� : " + (money / 1000) + "��");
		money = money - (money / 1000 * 1000);

		System.out.println("500�� : " + (money / 500) + "��");
		money = money - (money / 500 * 500);

		System.out.println("100�� : " + (money / 100) + "��");
		money = money - (money / 100 * 100);

	}

}
