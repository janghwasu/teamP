package festival;

public class fes2_3 {

	public static void main(String[] args) {
		long sum = 0;

		for (int i = 1; i < 78; i++) {
			long j = 78 - i;

			sum += i * j;
		}
		System.out.println(sum);
	}

}
  