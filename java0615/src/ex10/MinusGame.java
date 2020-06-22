package ex10;

import java.util.Random;

public class MinusGame implements Game {

	int num1;
	int num2;
	int sum;
	int life = 5;

	@Override
	public void select() {
		Random r = new Random();
		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;

	}

	@Override
	public String question() {

		return num1 + "-" + num2 + "=";
	}

	@Override
	public void check(int sum) {
		if (this.sum == sum) {
			System.out.println("정답");
			select();
		} else {
			System.out.println("오답");
			life--;
		}

	}

	@Override
	public int life() {
		// TODO Auto-generated method stub
		return life;
	}

}
