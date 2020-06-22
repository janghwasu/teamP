package festival;

import java.util.Scanner;

public class fes0602_1 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 1, 2, 4, 7, 11 과 같은 수열의 n번째 항까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 : ");
		int n = sc.nextInt();
		


		for (int i = 1; i <= n; i++) {
			for(int j=0; j<i; j++) {
				
				System.out.println(i+j);
			}

		}

	}

}
