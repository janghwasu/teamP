package festival;

import java.util.Scanner;

public class fes528_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("현재금액 : ");
		int num = sc.nextInt();
		
		System.out.println("잔돈 반환");
		System.out.println("10000원 : " + num / 10000 + "개");
		int num1 = sc.nextInt();
		num1 = num - num % 10000*10000;
		System.out.println("5000원 : " + num1 / 5000 + "개");
		num = num1 - num1 / 5000*5000;
		System.out.println("1000원 : " + num / 1000 + "개");
		num = num - num / 1000;
		System.out.println("500원 : " + num / 500 + "개");
		num = num - num / 500;
		System.out.println("100원 : " + num / 100 + "개");
		num = num - num / 100;
	}

}
