package exam04;

import java.util.Scanner;

public class Switch_test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;

		default:
			System.out.println("홀수입니다.");

		}

	}
}
