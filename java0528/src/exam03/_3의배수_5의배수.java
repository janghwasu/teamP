package exam03;

import java.util.Scanner;

public class _3의배수_5의배수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			// String str = String.format("%d는 3과 5의 배수입니다.", num);
			System.out.println(num + "는 3과 5의 배수입니다.");
		} else if (num % 5 == 0) {
			System.out.println(num + "는 5의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다.");
		} else {
			System.out.println(num + "는 3과 5의 배수가 아닙니다.");
		}
	}

}


