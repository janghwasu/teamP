package java0603;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 10보다 작을때만 계속 정수 받기

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 입력: ");
			int num = sc.nextInt();

			if (num > 10) {
				System.out.println("종료되었습니다.");
				break;

			}
		}
	}
}
