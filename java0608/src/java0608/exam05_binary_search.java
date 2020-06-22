package java0608;

public class exam05_binary_search {

	public static void main(String[] args) {
		// 이진탐색, 정렬된 데이터에서만 사용 가능

		int[] array = { 3, 4, 11, 19, 25, 34, 50, 87, 100, 108 };
		int key = 3;

		// key값이 몇번째 index에 있는지 binary search로 검색!

		int left = 0;
		int right = array.length - 1; // -1은 효율을 위해서

		while (true) {
			int mid = (left + right) / 2;
			if (key > array[mid]) {

				left = mid + 1; // +1은 효율을 위해서

			} else if (key < array[mid]) {

				right = mid - 1; // -1은 효율을 위해서

			} else if (key == array[mid]) {
				System.out.println(key + "는 " + mid + "번째 입니다.");
				break;

			}

		}

	}

}
