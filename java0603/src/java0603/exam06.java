package java0603;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// ���̾�Ʈ ���� ���α׷� do-while ��
		Scanner sc = new Scanner(System.in);
		int diet = 0;
		int i = 1;

		System.out.print("��������� : ");
		int weigh = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int target = sc.nextInt();

		do {
			System.out.print(i + "���� ���� ������ : ");
			int num = sc.nextInt();

			diet = diet + num;
			i++;

		} while (diet < (weigh - target));

		System.out.println((weigh - diet) + "kg �޼�!! �����մϴ�!!");

	}

}
