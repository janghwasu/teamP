package festival;

import java.util.Scanner;

public class fes0605_3 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
		// (선택정렬)

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");

			
			num[i] = sc.nextInt();

		}System.out.println("정렬 후 ");
		for (int i = 0; i < num.length; i++)

			System.out.print(num[i] + " ");
		
		

	}
}
