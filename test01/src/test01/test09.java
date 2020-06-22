package test01;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("³âµµ ÀÔ·Â >>");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}
	}
}
