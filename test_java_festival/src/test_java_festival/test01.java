package test_java_festival;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// 0528_01
		// ������ �Է¹޾�
		// 1�� �ڸ����� �ݿø� �� ����� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("�ݿø� �� �� : " + (num + 5) / 10 * 10);

	}

}
