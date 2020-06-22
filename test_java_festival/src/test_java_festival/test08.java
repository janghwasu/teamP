package test_java_festival;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int input = sc.nextInt();

		int output = 1;
		for (int i = 1; i <= input; i++) {
			output *= i;
		}
		sc.close();
		System.out.println("출력 : " + output);

	}
}
