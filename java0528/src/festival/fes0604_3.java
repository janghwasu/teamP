package festival;

import java.util.Scanner;

public class fes0604_3 {

	public static void main(String[] args) {
		// N과 X를 입력 받은 후 N개 정수 입력, X보다 작은수만 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt(); // 입력 수
		System.out.print("X 입력 >> ");
		int x = sc.nextInt(); // 조건 수

		int[] li = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.print((i + 1) + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			li[i] = num;

		}
		System.out.print("결과 : ");
		for (int i = 0; i < n; i++) {

			if (x > li[i]) {
				System.out.print(li[i]+" ");
			}
		}

	}

}
