package festival;

import java.util.Random;

public class fes0604_1 {

	public static void main(String[] args) {
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 작은 수를 각각 출력하시오.

		Random ran = new Random();
		int[] li = new int[8];
		System.out.print("배열에 있는 모든 값 : " + " ");

		for (int i = 0; i < 8; i++) {
			int rannum = ran.nextInt(100);
			li[i] = rannum;
			System.out.print(rannum + " ");

		}
		int max = li[0];
		int min = li[0];
		for (int j = 0; j < 8; j++) {

			if (max < li[j]) {
				max = li[j];
			}

		}
		for (int j = 0; j < 8; j++) {
			if (min > li[j]) {
				min = li[j];
			}

		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
