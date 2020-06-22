package java0608;

import java.util.Arrays;

public class exam_03_selection_sort {

	public static void main(String[] args) {
		// 선택정렬(내림차순, 최댓값이 좌측)

		int[] array = { 12, 45, 25, 4, 7 };

		for (int i = 0; i < array.length; i++) {

			int max = i;
			for (int j = i; j < array.length; j++)

				if (array[max] < array[j]) {
					max = j;

				}
			int temp = array[max];
			array[max] = array[i];
			array[i] = temp;

		}
		System.out.println(Arrays.toString(array));
	}

}
