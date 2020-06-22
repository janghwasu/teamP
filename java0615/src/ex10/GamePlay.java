package ex10;

import java.util.Scanner;

public class GamePlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MinusGame mg = new MinusGame();

		mg.select();
		while (true) {
			String question = mg.question();
			System.out.println(question);
			
		}

	}

}
