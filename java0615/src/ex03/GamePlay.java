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

		System.out.println("게임 선택");
		System.out.println("[1]더하기 게임  [2]빼기 게임  [3]곱하기 게임 [4]나누기 게임");
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

			// 정답이라면 새로운 문제를
			// 오답이라면 이전 문제를 띄워주세요

			game.check(sum);

			// 목숨이 0이 되었다면 게임을 종료

			if (game.life() == 0) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}

		}

	}
}
