package festival;

import java.util.Scanner;

public class fes0610_2 {

	public static void main(String[] args) {
		// �׸��� ���� ���(��-��)���ڷ� ������ ������ ���ڸ�
		// �־��� ���ڿ� ���� ����ϰ� ������ ���ǰ� �Ǵ�
		// ����� ������ ����ϴ� ���α׷��� �ۼ��϶�

		Scanner sc = new Scanner(System.in);

		System.out.println("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >>");
		String num = sc.next();

		int sum = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.substring(i, i + 1).equals("1")) {
				sum += 2;
			} else if (num.substring(i, i + 1).equals("7")) {
				sum += 3;
			} else if (num.substring(i, i + 1).equals("4")) {
				sum += 4;
			} else if (num.substring(i, i + 1).equals("2") || num.substring(i, i + 1).equals("3")
					|| num.substring(i, i + 1).equals("5")) {
				sum += 5;
			} else if (num.substring(i, i + 1).equals("6") || num.substring(i, i + 1).equals("9")) {
				sum += 6;
			} else if (num.substring(i, i + 1).equals("8")) {
				sum += 7;

			}
		}
		System.out.println("���('-')�� �� �� >> " + sum);
	}
}
