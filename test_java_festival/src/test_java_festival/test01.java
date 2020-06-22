package test_java_festival;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// 0528_01
		// 정수를 입력받아
		// 1의 자리에서 반올림 한 결과를 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("반올림 후 값 : " + (num + 5) / 10 * 10);

	}

}
