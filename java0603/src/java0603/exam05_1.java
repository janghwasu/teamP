package java0603;

import java.util.Scanner;

public class exam05_1 {

	public static void main(String[] args) {
		// 계산기 프로그램 while문

		Scanner sc = new Scanner(System.in);
		String input;

		while (true) {

			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("1더하기 2빼기 : ");
			int num3 = sc.nextInt();

			if (num3 == 1) {
				System.out.println("더하기 결과는 " + (num1 + num2));
			} else {
				System.out.println("빼기 결과는 " + (num1 - num2));
			}

			System.out.println("다시 실행? (Y/N)");
			input = sc.next();
			if (input.equals("N"))
				break;
		}

	}

}
