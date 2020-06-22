package test_java_festival;

import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Çà °³¼ö : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
