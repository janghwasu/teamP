package test_java_festival;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// 0528_02
		// �Ž������� �Է� �޾� ������� �ϴ� ������ ������ ����ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		// ��, �ִ������ 10000��, �ּҴ����� 100��

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();
		sc.close();
		System.out.println("�ܵ� ��ȯ");
		System.out.println("10000�� : " + money / 10000 + "��");
		money -= money / 10000 * 10000;
		System.out.println("5000�� : " + money / 5000 + "��");
		money -= money / 5000 * 5000;
		System.out.println("1000�� : " + money / 1000 + "��");
		money -= money / 1000 * 1000;
		System.out.println("500�� : " + money / 500 + "��");
		money -= money / 500 * 500;
		System.out.println("100�� : " + money / 100 + "��");
		money -= money / 100 * 100;

	}

}
