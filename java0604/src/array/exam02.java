package array;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 4, 4, 3, 6, 8, 1, 7, 9 };
//		array = new int[10];
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		System.out.println(sum);
		avg = sum / array.length;
		System.out.println(avg);

	}
}
