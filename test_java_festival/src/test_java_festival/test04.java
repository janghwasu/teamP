package test_java_festival;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번재 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		System.out.println(input2%10 * input1);
		System.out.println(input2/10%10 * input1);
		System.out.println(input2/100 * input1);
		System.out.println(input1 * input2);
		
	}

}
