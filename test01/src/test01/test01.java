package test01;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ִ� �����&�ּҰ���� ���ϱ�");
		System.out.println("����1�Է�>>");

		int num1 = sc.nextInt();
		System.out.println("����2�Է�>>");
		int num2 = sc.nextInt();

		int min = num1 > num2 ? num1 % num2 : num2 % num1;
		int max = (num2*num1) / min;

		System.out.println("�ִ����� : " + min);
		System.out.println("�ּҰ���� : " + max);
	}
}
