package festival;

import java.util.Scanner;

public class fes528_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����ݾ� : ");
		int num = sc.nextInt();
		
		System.out.println("�ܵ� ��ȯ");
		System.out.println("10000�� : " + num / 10000 + "��");
		int num1 = sc.nextInt();
		num1 = num - num % 10000*10000;
		System.out.println("5000�� : " + num1 / 5000 + "��");
		num = num1 - num1 / 5000*5000;
		System.out.println("1000�� : " + num / 1000 + "��");
		num = num - num / 1000;
		System.out.println("500�� : " + num / 500 + "��");
		num = num - num / 500;
		System.out.println("100�� : " + num / 100 + "��");
		num = num - num / 100;
	}

}
