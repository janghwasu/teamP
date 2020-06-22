package java0603;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 숫자 입력 후 짝수 홀수 갯수 누적, -1 입력시 종료

		Scanner sc = new Scanner(System.in);

		int even = 0; // 짝수
		int odd = 0; // 홀수

		while (true) {

			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();

			if (input % 2 == 0) {
				even++;

			} else if (input % 2 == 1) {
				odd++;

			} else if (input == -1) {

				System.out.println("종료되었습니다.");

				break;

			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);
		}

	}

}
