package eaxm02;

import java.util.Scanner;

public class ¦��_Ȧ�� {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�  : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num + "�� " +result+"�Դϴ�.");
		
		
	}

}
