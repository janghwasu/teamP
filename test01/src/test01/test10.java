package test01;

public class test10 {
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 1;
		for (int i = 77; i > 0; i--) {
			sum += (i * j);
			j++;
		}
		System.out.println(sum);
	}
}
