package java0608;

public class exam05_binary_search {

	public static void main(String[] args) {
		// ����Ž��, ���ĵ� �����Ϳ����� ��� ����

		int[] array = { 3, 4, 11, 19, 25, 34, 50, 87, 100, 108 };
		int key = 3;

		// key���� ���° index�� �ִ��� binary search�� �˻�!

		int left = 0;
		int right = array.length - 1; // -1�� ȿ���� ���ؼ�

		while (true) {
			int mid = (left + right) / 2;
			if (key > array[mid]) {

				left = mid + 1; // +1�� ȿ���� ���ؼ�

			} else if (key < array[mid]) {

				right = mid - 1; // -1�� ȿ���� ���ؼ�

			} else if (key == array[mid]) {
				System.out.println(key + "�� " + mid + "��° �Դϴ�.");
				break;

			}

		}

	}

}
