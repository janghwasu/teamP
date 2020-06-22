package test01;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("N 입력 >>");
		int n = sc.nextInt();
		System.out.print("X 입력>> ");
		int x = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >>");
			array[i] = sc.nextInt();
		}
		System.out.println("결과>>");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) {
				System.out.println(array[i]);
			}

		}
	}
}
