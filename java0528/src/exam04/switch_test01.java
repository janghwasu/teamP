package exam04;

import java.util.Scanner;

public class switch_test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("User : ");
		String user_input = sc.next();
		switch (user_input) {
		case "�ȳ��ϼ���":
			System.out.println("pc : ��, �ȳ��ϼ���!");
			break;
		case "�ݰ�����":
			System.out.println("pc : ��, �ݰ�����!");
			break;
		case "�����ϼ���":
			System.out.println("pc : ��, �����ϼ���!");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
		}

	}

}
