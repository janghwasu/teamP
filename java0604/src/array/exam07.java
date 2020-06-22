package array;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][5]; // 2차원 배열
		int num = 1;
		

//	 System.out.println(array.length);

		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				array[i][j] = num;
				num++;
				System.out.print(array[i][j] + "	");
			}

		}

	}
}