package java0601;

import java.util.Scanner;

public class 구구단입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("단 입력 : ");
		int i = sc.nextInt();
		for (int j = 1; j <= 9; j++)
			System.out.println(i + "*" + j + "=" + (i * j));

	}

}
