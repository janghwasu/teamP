package exam03;

import java.util.Scanner;

public class if��_���� {

	public static void main(String[] args) {

// 1������
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ��ǰ ������ �Է��ϼ��� : ");
//		int num = sc.nextInt();
//
//		if (num <= 10) {
//			System.out.println("������" + 10000 * num + "�� �Դϴ�.");
//
//		} else {
//			System.out.println("������" + 9000 * num + "�� �Դϴ�.");
//		}

		
// 1-1�� ����		
		int price = 10000;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("����� ��ǰ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num % 10 == 0 && num >= 11) {
			money = (int) (num * price * 0.85);
		} else if (num >= 11)
			money = (int) (num * price * 0.9);
		else if (num % 10 == 0) {
			money = (int) (num * price * 0.95);
		} else {
			money = num * price;
		}
		String result = String.format("������Ʈ���� : %d", money);
		System.out.println(result);

		
// 1-2�� ����
		
		
	}

}
