package array;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5]; // 2차원 배열
		int num = 21;

		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				array[i][j] = num;
				num++;

			}

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[j][i] + "	");

			}
			System.out.println();

		}

	}

}