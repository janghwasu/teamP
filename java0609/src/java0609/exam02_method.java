package java0609;

import java.util.Scanner;

public class exam02_method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 세개를 입력 하세요 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println(addNumber(num1, num2, num3));

		sc.close();

	}

	public static int addNumber(int num1, int num2, int num3) {

		return num1 + num2 + num3;

	}

}
