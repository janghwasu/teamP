package festival;

import java.util.Scanner;

public class fes2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println((num2%10)*num1);
		System.out.println(((num2%100-num2%10)/10)*num1);
		System.out.println(((num2-(num2%100))/100)*num1);
		System.out.println(num2*num1);
	}

}
