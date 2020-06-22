package test01;

public class test03 {
	public static void main(String[] args) {

		int[][] array = new int[7][7];
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i + j > 2 && i + j < 10 && Math.abs(i - j) < 4) {
					result++;
					array[i][j] = result;
					System.out.print(array[i][j] + "\t");

				} else {
					array[i][j] = 0;
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
