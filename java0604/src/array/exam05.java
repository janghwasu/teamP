package array;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° �Է� >> ");

			num[i] = sc.nextInt();

		}
		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
