package festival;

import java.util.Scanner;

public class fes2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();

		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println((num2%10)*num1);
		System.out.println(((num2%100-num2%10)/10)*num1);
		System.out.println(((num2-(num2%100))/100)*num1);
		System.out.println(num2*num1);
	}

}
