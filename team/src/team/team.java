package team;

import java.util.Scanner;

public class team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("==========�����������α׷�==========");
		System.out.print("[1]�����Է� [2]����Ȯ�� [3]��üȮ�� [4]������� [5]���� >> ");
		int input = sc.nextInt();

		if (input == 1) {

			for (int i = 0; i < 5; i++) {
				System.out.println("==========�����Է�==========");

				System.out.print(i + 1 + ". �̸��Է� : ");
				String names = sc.next();
				System.out.print(i + 1 + ". DataBase���� : ");
				int scores_d = sc.nextInt();
				System.out.print(i + 1 + ". Python���� : ");
				int scores_p = sc.nextInt();
				System.out.print(i + 1 + ". Java���� : ");
				int scores_j = sc.nextInt();
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
				System.out.println("==========�����������α׷�==========");
				System.out.println("[1]�����Է� [2]����Ȯ�� [3]��üȮ�� [4]������� [5]���� >> ");

			}

		} else if (input == 5) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

}
