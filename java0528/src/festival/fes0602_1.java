package festival;

import java.util.Scanner;

public class fes0602_1 {

	public static void main(String[] args) {
		// ���� n�� �Է¹޾� 1, 2, 4, 7, 11 �� ���� ������ n��° �ױ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("n �Է� : ");
		int n = sc.nextInt();
		


		for (int i = 1; i <= n; i++) {
			for(int j=0; j<i; j++) {
				
				System.out.println(i+j);
			}

		}

	}

}
