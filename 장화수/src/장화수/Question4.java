package ��ȭ��;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// ���̾�Ʈ ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.println("----���̾�Ʈ ���α׷�----");
		System.out.print("���� �����Ը� �Է��Ͻÿ� : ");
		int curr = sc.nextInt();
		System.out.print("��ǥ �����Ը� �Է��Ͻÿ� : ");
		int goal = sc.nextInt();
		int i = 0;

		while (i <= goal) {

			System.out.print((i + 1) + "���� ���� ������ �Է� : ");
			int minus = sc.nextInt();
			curr = curr - minus;
			i++;

			if (curr <= goal)

				break;
		}
		System.out.println(i + "���� ���̾�Ʈ ���� !!!");

	}

}
