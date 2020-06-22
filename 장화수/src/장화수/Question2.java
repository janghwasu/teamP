package 장화수;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Scanner로 입력 받은 값 교환

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp = 0;

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println(num1);
		System.out.println(num2);

	}

}
