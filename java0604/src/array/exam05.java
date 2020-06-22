package array;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");

			num[i] = sc.nextInt();

		}
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
