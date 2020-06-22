package java0608;

import java.util.Arrays;

public class exam_03_01_selection_sort {

	public static void main(String[] args) {
		// 선택정렬(내림차순, 최댓값이 좌측)

		int[] array = { 1, 53, 8, 87, 60 };

		for (int j = 0; j < array.length; j++) {

			int max = j;

			for (int i = j + 1; i < array.length; i++) {
				if (array[max] < array[i]) {
					max = i;

				}

			}
			int temp = array[j];
			array[j] = array[max];
			array[max] = temp;
		System.out.println(Arrays.toString(array));
		}
	}
	

}
