package test01;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("N �Է� >>");
		int n = sc.nextInt();
		System.out.print("X �Է�>> ");
		int x = sc.nextInt();

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}
		System.out.println("���>>");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) {
				System.out.println(array[i]);
			}

		}
	}
}
