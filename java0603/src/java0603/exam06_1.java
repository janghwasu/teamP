package java0603;

import java.util.Scanner;

public class exam06_1 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램 while문

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 무게 : ");
		int goal = sc.nextInt();
		int i = 1;

		while (now > goal) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			now = now - minus; // now-=minus
			i++;

		}
		System.out.println(now + "kg 달성!! 축하합니다!!");
	}

}
