package java0608;

import java.util.Random;

public class exam_01 {

	public static void main(String[] args) {
		// 1차원 정수형 배열 선언 후 임의값으로 초기화
		// 홀수 값이 몇개인지 출력하는 프로그램

		int[] array = new int[10];
		Random ran = new Random();
		int odd = 0;

		// 각각의 array 에 임의의 수 넣기

		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				odd++;
			}
		}
		System.out.println("array에 있는 홀수의 개수는 " + odd + "개 입니다.");

	}

}
