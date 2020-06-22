package test01;

public class test06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;

			} else if (i % 2 != 0) {
				System.out.print(i + " ");
				sum += i;
			}

		}
		System.out.println();
		System.out.println("°á°ú " + sum);

	}
}
