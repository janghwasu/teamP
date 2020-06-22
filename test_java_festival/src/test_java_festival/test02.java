package test_java_festival;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// 0528_02
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
		// 프로그램을 작성하시오.
		// 단, 최대단위는 10000원, 최소단위는 100원

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 금액 : ");
		int money = sc.nextInt();
		sc.close();
		System.out.println("잔돈 반환");
		System.out.println("10000원 : " + money / 10000 + "개");
		money -= money / 10000 * 10000;
		System.out.println("5000원 : " + money / 5000 + "개");
		money -= money / 5000 * 5000;
		System.out.println("1000원 : " + money / 1000 + "개");
		money -= money / 1000 * 1000;
		System.out.println("500원 : " + money / 500 + "개");
		money -= money / 500 * 500;
		System.out.println("100원 : " + money / 100 + "개");
		money -= money / 100 * 100;

	}

}
