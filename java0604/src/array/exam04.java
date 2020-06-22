package array;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 23, 4, 36, 36, 46, 24, 33, 24, 24, 53, 56, 46, 54, 23 };
		int max = array[0]; // array의 첫번째 함수와 비교
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 값은 " + max + " 입니다.");

	}

}
