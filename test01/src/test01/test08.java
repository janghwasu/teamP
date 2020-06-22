package test01;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 N 입력 : ");
		int n = sc.nextInt();

		int[][] array = new int[5][5];
		int sum = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sum;
				sum++;
			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}
}
