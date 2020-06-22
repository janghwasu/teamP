package exam04;

import java.util.Scanner;

import first.main;

public class if문_예제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		int price = num * 10000;
//		double price = num*10000; 정수에 실수가 들어가서 double 타입으로 변경

		if (num > 10) {
			price = price - (int) (num * 10000 * 0.1);
		}
		if (num % 10 == 0) {
			price = price - (int) (num * 10000 * 0.05);
		}
		System.out.println(price);
	}
}
