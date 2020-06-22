package exam03;

import java.util.Scanner;

public class if문_예제 {

	public static void main(String[] args) {

// 1번문제
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사려는 상품 갯수를 입력하세요 : ");
//		int num = sc.nextInt();
//
//		if (num <= 10) {
//			System.out.println("가격은" + 10000 * num + "원 입니다.");
//
//		} else {
//			System.out.println("가격은" + 9000 * num + "원 입니다.");
//		}

		
// 1-1번 문제		
		int price = 10000;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 10 == 0 && num >= 11) {
			money = (int) (num * price * 0.85);
		} else if (num >= 11)
			money = (int) (num * price * 0.9);
		else if (num % 10 == 0) {
			money = (int) (num * price * 0.95);
		} else {
			money = num * price;
		}
		String result = String.format("선물셋트가격 : %d", money);
		System.out.println(result);

		
// 1-2번 문제
		
		
	}

}
