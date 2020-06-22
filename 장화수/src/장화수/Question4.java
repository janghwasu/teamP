package 장화수;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// 다이어트 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int curr = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int goal = sc.nextInt();
		int i = 0;

		while (i <= goal) {

			System.out.print((i + 1) + "주차 감량 몸무게 입력 : ");
			int minus = sc.nextInt();
			curr = curr - minus;
			i++;

			if (curr <= goal)

				break;
		}
		System.out.println(i + "주차 다이어트 성공 !!!");

	}

}
