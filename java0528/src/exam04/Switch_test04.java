package exam04;

import java.util.Scanner;

public class Switch_test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("±Ý¾×À» ÀÔ·ÂÇÏ¼¼¿ä. ");
		int money = sc.nextInt();
		System.out.println("¸Þ´º¸¦ °í¸£¼¼¿ä");
		System.out.println("1. ÄÝ¶ó(800¿ø) 2. »ý¼ö(500¿ø) 3. ºñÅ¸¹Î¿öÅÍ(1500¿ø) >>");
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
			System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä.");
			System.out.println("ÀÜµ· : " + money + "¿ø");
		} else {
			System.out.println("ÀÜµ· : " + (money - price) + "¿ø");
		}
	}
}

//		if (menu == 1 && money >= 800) {
//			System.out.println("ÀÜµ· : " + (money - 800) + "¿ø");
//		} else if (menu == 2 && money >= 500) {
//			System.out.println("ÀÜµ· : " + (money - 500) + "¿ø");
//		} else if (menu == 3 && money >= 1500) {
//			System.out.println("ÀÜµ· : " + (money - 1500) + "¿ø");
//		} else {
//			System.out.println("µ·ÀÌ ºÎÁ·ÇØ¿ä¤Ð¤Ð" + money + "¿ø");
//		}
