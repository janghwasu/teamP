package java0603;

import java.util.Scanner;

public class exam03_1 {

	public static void main(String[] args) {
		// 숫자를 입력받아 누적하는 프로그램, -1 입력시 중단

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();

			sum += input; // sum = sum+input

			System.out.println("누적 결과 : " + sum);
			if (input == -1) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
