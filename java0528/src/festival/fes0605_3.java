package festival;

import java.util.Scanner;

public class fes0605_3 {

	public static void main(String[] args) {
		// 5���� ������ �Է� �޾� �������� �����Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�.
		// (��������)

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "��° �� �Է� : ");

			
			num[i] = sc.nextInt();

		}System.out.println("���� �� ");
		for (int i = 0; i < num.length; i++)

			System.out.print(num[i] + " ");
		
		

	}
}
