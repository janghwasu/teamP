package 장화수;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// 지폐와 동전 갯수 출력 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.println("총금액 입력 : ");
		int money = sc.nextInt();

		System.out.println("잔돈 : " + money + "원");

		System.out.println("10000원 : " + (money / 10000) + "개");
		money = money - (money / 10000 * 10000);

		System.out.println("5000원 : " + (money / 5000) + "개");
		money = money - (money / 5000 * 5000);

		System.out.println("1000원 : " + (money / 1000) + "개");
		money = money - (money / 1000 * 1000);

		System.out.println("500원 : " + (money / 500) + "개");
		money = money - (money / 500 * 500);

		System.out.println("100원 : " + (money / 100) + "개");
		money = money - (money / 100 * 100);

	}

}
