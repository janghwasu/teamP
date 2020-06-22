package test01;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("n ют╥б : ");
		int n = sc.nextInt();
		int j = 1;
		int sum = 1;
		for (int i = 0; i < n; i++) {

			System.out.print(sum + " ");
			sum += i + j;

		}

	}
}
