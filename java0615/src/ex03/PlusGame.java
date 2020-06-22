package ex03;

import java.util.Random;

public class PlusGame implements Game {
	private int num1; // 첫번째 문제 정수를 기억할 변수
	private int num2; // 두번째 문제 정수를 기억할 변수
	private int sum; // 정답을 기억할 변수
	private int life = 5; // 목숨 수

	@Override
	public void select() {
		// 랜덤을 활용하여 num1과 num2에 숫자를 저장 범위는 1~50
		// sum에는 num1, num2의 합을 저장

		Random r = new Random();

		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;
		sum = num1 + num2;

	}

	@Override
	public String Question() {
		// num1,2에 뽑힌 값을 문자열로 변환하여 돌려줌

		String value = num1 + "+" + num2 + "=";
		return value;
	}

	@Override
	public void check(int sum) {
		// 입력받은 값과 일치하면 정답
		// 아니면 오답입니다. 작성

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

		return life;

	}

}
