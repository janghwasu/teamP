package team;

import java.util.Scanner;

public class team1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[5][3];
		String[] names = new String[5];

		while (true) {

			System.out.println("==========성적관리프로그램==========");
			System.out.print("[1]성적입력 [2]개별확인 [3]전체확인 [4]성적통계 [5]종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("==========성적입력==========");
				for (int i = 0; i < names.length; i++) {

					System.out.print(i + 1 + ". 이름입력 : ");
					names[i] = sc.next();
					System.out.print(i + 1 + ". DataBase점수 : ");
					scores[i][0] = sc.nextInt();
					System.out.print(i + 1 + ". Python점수 : ");
					scores[i][1] = sc.nextInt();
					System.out.print(i + 1 + ". Java점수 : ");
					scores[i][2] = sc.nextInt();
					System.out.println("등록이 완료되었습니다.");

				}
			} else if (input == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
