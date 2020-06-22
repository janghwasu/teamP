package java0610;

import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("1.재생  2.정지  3.다음곡  4.이전곡  5.종료  >> ");
		int num = sc.nextInt();

		sc.close();

		if (num == 5) {
			System.out.println("프로그램 종료");
		}

	}

}
