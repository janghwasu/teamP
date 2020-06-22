package eaxm02;

import java.util.Scanner;

public class 삼항연산자_예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : "); // ln 은 줄바꿈 명령어
		int num1 = sc.nextInt();

		System.out.println("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		// System.out.println("두 수의 차 : "+result);
		String str = String.format("%d와 %d의 차이 : %d", num1, num2, result);
		System.out.println(str);

	}

}
