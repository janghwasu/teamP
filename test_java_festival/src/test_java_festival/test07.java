package test_java_festival;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("����1");
		int num1 = sc.nextInt();
		System.out.println("����2");
		int num2 = sc.nextInt();

		int result1 = num1 < num2 ? num2 % num1 : num1 % num2;

		System.out.println("�ִ����� : " + result1);

		int result2 = num1*num2/result1;
		System.out.println("�ּҰ���� : " + result2);
	}
}
