package test_java_festival;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i < 101; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
				sum += i;
			} else if (i % 2 == 0) {
				System.out.print(-i + " ");
				sum -= i;
			}

		}System.out.println();
		System.out.print("°á°ú : " + sum);

	}

}
