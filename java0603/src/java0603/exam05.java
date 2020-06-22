package java0603;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// +,- 계산기 프로그램 do-while문

		Scanner sc = new Scanner(System.in);
		String input4;

		do {
			System.out.print("첫 번째 정수 입력 >> ");
			int input1 = sc.nextInt();
			System.out.print("두 번째 정수 입력 >> ");
			int input2 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기 >> ");
			int input3 = sc.nextInt();

			if (input3 == 1) {
				System.out.println("더하기 연산 결과는 " + (input1 + input2));
			} else {
				System.out.println("빼기 연산 결과는 " + (input1 - input2));
			}

			System.out.println("다시 실행하시겠습니까? (Y/N)");

			input4 = sc.next();

		} while (input4.equals("Y"));
		System.out.println("종료");
	}
}
