package team;

import java.util.Scanner;

public class team1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[5][3];
		String[] names = new String[5];

		while (true) {

			System.out.println("==========�����������α׷�==========");
			System.out.print("[1]�����Է� [2]����Ȯ�� [3]��üȮ�� [4]������� [5]���� >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("==========�����Է�==========");
				for (int i = 0; i < names.length; i++) {

					System.out.print(i + 1 + ". �̸��Է� : ");
					names[i] = sc.next();
					System.out.print(i + 1 + ". DataBase���� : ");
					scores[i][0] = sc.nextInt();
					System.out.print(i + 1 + ". Python���� : ");
					scores[i][1] = sc.nextInt();
					System.out.print(i + 1 + ". Java���� : ");
					scores[i][2] = sc.nextInt();
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");

				}
			} else if (input == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
