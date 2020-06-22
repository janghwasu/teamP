package test01;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("최대 공약수&최소공배수 구하기");
		System.out.println("숫자1입력>>");

		int num1 = sc.nextInt();
		System.out.println("숫자2입력>>");
		int num2 = sc.nextInt();

		int min = num1 > num2 ? num1 % num2 : num2 % num1;
		int max = (num2*num1) / min;

		System.out.println("최대공약수 : " + min);
		System.out.println("최소공배수 : " + max);
	}
}
