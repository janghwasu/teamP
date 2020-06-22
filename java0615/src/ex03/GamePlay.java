package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GamePlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlusGame plusgame = new PlusGame();
		minusGame minusgame = new minusGame();
		MultiplyGame multiGame = new MultiplyGame();
		DividGame dividegame = new DividGame();

		ArrayList<Game> list = new ArrayList<Game>();

		System.out.println("���� ����");
		System.out.println("[1]���ϱ� ����  [2]���� ����  [3]���ϱ� ���� [4]������ ����");
		int choice = sc.nextInt();
		Game game = null;
		if (choice == 1) {
			game = new PlusGame();
		} else if (choice == 2) {
			game = new minusGame();
		} else if (choice == 3) {
			game = new MultiplyGame();
		} else if (choice == 4) {
			game = new DividGame();
		}
		game.select();
		while (true) {
			String question = game.Question();
			System.out.print(question);
			int sum = sc.nextInt();

			// �����̶�� ���ο� ������
			// �����̶�� ���� ������ ����ּ���

			game.check(sum);

			// ����� 0�� �Ǿ��ٸ� ������ ����

			if (game.life() == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}

		}

	}
}
