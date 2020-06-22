package java0608;

import java.util.Arrays;

public class exam_01bubble_sort {

	public static void main(String[] args) {
		// 버블 정렬, 인접한 숫자를 비교해서 서로의 위치를 옮김

		int[] array = { 45, 12, 25, 7, 4 };
		// 오름차순 정렬
		int temp = 0;

		for (int j = 1; j < array.length; j++) {

			for (int i = 0; i < array.length - j; i++) {

				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;

				}
				System.out.println(Arrays.toString(array)); // for 문 안쓰고 메소드로 출력
			}

		}

//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//
//		}
	}
}