package test_java_festival;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A");
			int a = sc.nextInt();
			System.out.print("B");
			int b = sc.nextInt();

			if (a == 0 || b == 0) {
				break;
			} else if (a != 0 && b != 0) {
				int result = a - b;
				System.out.println("°á°ú : " + result);
			}
		}
	}
}
