package exam04;

import java.util.Scanner;

public class switch_test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("User : ");
		String user_input = sc.next();
		switch (user_input) {
		case "안녕하세요":
			System.out.println("pc : 네, 안녕하세요!");
			break;
		case "반가워요":
			System.out.println("pc : 네, 반가워요!");
			break;
		case "수고하세요":
			System.out.println("pc : 네, 수고하세요!");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		
		}

	}

}
