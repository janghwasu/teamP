package team;

import java.util.Scanner;

public class team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("==========성적관리프로그램==========");
		System.out.print("[1]성적입력 [2]개별확인 [3]전체확인 [4]성적통계 [5]종료 >> ");
		int input = sc.nextInt();

		if (input == 1) {

			for (int i = 0; i < 5; i++) {
				System.out.println("==========성적입력==========");

				System.out.print(i + 1 + ". 이름입력 : ");
				String names = sc.next();
				System.out.print(i + 1 + ". DataBase점수 : ");
				int scores_d = sc.nextInt();
				System.out.print(i + 1 + ". Python점수 : ");
				int scores_p = sc.nextInt();
				System.out.print(i + 1 + ". Java점수 : ");
				int scores_j = sc.nextInt();
				System.out.println("등록이 완료되었습니다.");
				System.out.println("==========성적관리프로그램==========");
				System.out.println("[1]성적입력 [2]개별확인 [3]전체확인 [4]성적통계 [5]종료 >> ");

			}

		} else if (input == 5) {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
