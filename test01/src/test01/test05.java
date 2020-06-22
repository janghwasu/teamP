package test01;

public class test05 {

	public static void main(String[] args) {

		System.out.print(jumpcase(4));
	}

	private static int jumpcase(int i) {
		if (i <= 2) {
			return i;
		} else {
			return jumpcase(i - 1) + jumpcase(i - 2);

		}

	}

}
