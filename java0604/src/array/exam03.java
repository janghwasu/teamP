package array;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 6, 23, 7, 4, 5, 76, 43, 8, 23, 6, 57, 43 };
		System.out.print("array에 들어있는 짝수는 ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.print(array[i] + " ");
			}
		}
		System.out.print("입니다.");

	}

}
