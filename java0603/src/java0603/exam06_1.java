package java0603;

import java.util.Scanner;

public class exam06_1 {

	public static void main(String[] args) {
		// ���̾�Ʈ ���� ���α׷� while��

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ ���� : ");
		int goal = sc.nextInt();
		int i = 1;

		while (now > goal) {
			System.out.print(i + "���� ���� ������ : ");
			int minus = sc.nextInt();
			now = now - minus; // now-=minus
			i++;

		}
		System.out.println(now + "kg �޼�!! �����մϴ�!!");
	}

}
