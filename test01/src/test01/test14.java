package test01;

import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번재 숫자입력 >>");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자입력>>");
		int num2 = sc.nextInt();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
		
		
	}
}
