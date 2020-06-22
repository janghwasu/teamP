package festival;

import java.util.Scanner;

public class fes0605_2 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(); // 입력받은 정수 N
		String result = ""; // 출력할 값

		for (int i = n; i > 0; i /= 2) {
			result = String.valueOf(i % 2) + result;
		}

		System.out.println(result);

	}
}
