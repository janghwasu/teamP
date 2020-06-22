package ex03;

import java.util.Random;

public class PlusGame implements Game {
	private int num1; // ù��° ���� ������ ����� ����
	private int num2; // �ι�° ���� ������ ����� ����
	private int sum; // ������ ����� ����
	private int life = 5; // ��� ��

	@Override
	public void select() {
		// ������ Ȱ���Ͽ� num1�� num2�� ���ڸ� ���� ������ 1~50
		// sum���� num1, num2�� ���� ����

		Random r = new Random();

		num1 = r.nextInt(50) + 1;
		num2 = r.nextInt(50) + 1;
		sum = num1 + num2;

	}

	@Override
	public String Question() {
		// num1,2�� ���� ���� ���ڿ��� ��ȯ�Ͽ� ������

		String value = num1 + "+" + num2 + "=";
		return value;
	}

	@Override
	public void check(int sum) {
		// �Է¹��� ���� ��ġ�ϸ� ����
		// �ƴϸ� �����Դϴ�. �ۼ�

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

		return life;

	}

}
