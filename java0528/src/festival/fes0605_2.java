package festival;

import java.util.Scanner;

public class fes0605_2 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 2������ ��ȯ�ؼ� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt(); // �Է¹��� ���� N
		String result = ""; // ����� ��

		for (int i = n; i > 0; i /= 2) {
			result = String.valueOf(i % 2) + result;
		}

		System.out.println(result);

	}
}
