package java0603;

import java.util.Random;
import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// plus game

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		do {
			int num1 = ran.nextInt(10) + 1;
			int num2 = ran.nextInt(10) + 1;
			System.out.println("===PLUS GAME===");
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();

			if (result == num1 + num2) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? (Y/N)");
				String input = sc.next();
				if ("N".equals(input)) {
					System.out.println("종료합니다.");
					break;
				}
			}
		} while (true);

	}
}