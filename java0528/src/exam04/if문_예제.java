package exam04;

import java.util.Scanner;

import first.main;

public class if��_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ��ǰ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int price = num * 10000;
//		double price = num*10000; ������ �Ǽ��� ���� double Ÿ������ ����

		if (num > 10) {
			price = price - (int) (num * 10000 * 0.1);
		}
		if (num % 10 == 0) {
			price = price - (int) (num * 10000 * 0.05);
		}
		System.out.println(price);
	}
}
