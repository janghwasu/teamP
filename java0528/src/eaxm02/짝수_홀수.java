package eaxm02;

import java.util.Scanner;

public class Â¦¼ö_È¦¼ö {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Á¤¼ö ÀÔ·Â  : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "Â¦¼ö" : "È¦¼ö";
		System.out.println(num + "´Â " +result+"ÀÔ´Ï´Ù.");
		
		
	}

}
