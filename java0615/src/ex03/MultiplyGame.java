package ex03;

import java.util.Random;

public class MultiplyGame implements Game {
	private int num1; // ù��° ���� ������ ����� ����
	private int num2; // �ι�° ���� ������ ����� ����
	private int sum; // ������ ����� ����
	private int life = 5; // ��� ��

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
			System.out.println("�����Դϴ�.");
			select();
		} else {
			System.out.println("�����Դϴ�.");
			life--;

		}

	}

	@Override
	public int life() {
		// TODO Auto-generated method stub
		return life;
	}

}
