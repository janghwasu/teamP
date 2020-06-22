package java0603;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램 do-while 문
		Scanner sc = new Scanner(System.in);
		int diet = 0;
		int i = 1;

		System.out.print("현재몸무게 : ");
		int weigh = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int target = sc.nextInt();

		do {
			System.out.print(i + "주차 감량 몸무게 : ");
			int num = sc.nextInt();

			diet = diet + num;
			i++;

		} while (diet < (weigh - target));

		System.out.println((weigh - diet) + "kg 달성!! 축하합니다!!");

	}

}
