package ex03;

import java.util.Random;

public class MultiplyGame implements Game {
	private int num1; // 첫번째 문제 정수를 기억할 변수
	private int num2; // 두번째 문제 정수를 기억할 변수
	private int sum; // 정답을 기억할 변수
	private int life = 5; // 목숨 수

	@Override
	public void select() {

		Random r = new Random();

		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;
		sum = num1 * num2;
	}

	@Override
	public String Question() {
		String value = num1 + "*" + num2 + "=";
		return value;
	}

	@Override
	public void check(int sum) {
		if (this.sum == sum) {
			System.out.println("정답입니다.");
			select();
		} else {
			System.out.println("오답입니다.");
			life--;

		}

	}

	@Override
	public int life() {
		// TODO Auto-generated method stub
		return life;
	}

}
