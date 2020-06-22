package java0603;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		while (true) {

			System.out.print("숫자 입력  :");
			int num = sc.nextInt();

			num1 = num1 + num;

			System.out.println("누적결과 : " + num1);

			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;

			}

		}

	}

}
