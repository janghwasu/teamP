package exam04;

import java.util.Scanner;

public class Switch_test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ݾ��� �Է��ϼ���. ");
		int money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.println("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >>");
		int menu = sc.nextInt();
		int price = 0;

		switch (menu) {
		case 1:
			price = 800;
			break;
		case 2:
			price = 500;
			break;
		case 3:
			price = 1500;
			break;
		}
		if (money < price) {
			System.out.println("���� �����ؿ�.");
			System.out.println("�ܵ� : " + money + "��");
		} else {
			System.out.println("�ܵ� : " + (money - price) + "��");
		}
	}
}

//		if (menu == 1 && money >= 800) {
//			System.out.println("�ܵ� : " + (money - 800) + "��");
//		} else if (menu == 2 && money >= 500) {
//			System.out.println("�ܵ� : " + (money - 500) + "��");
//		} else if (menu == 3 && money >= 1500) {
//			System.out.println("�ܵ� : " + (money - 1500) + "��");
//		} else {
//			System.out.println("���� �����ؿ�Ф�" + money + "��");
//		}
