package festival;

import java.util.Scanner;

public class fes528_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		int sum = num + 5;
		System.out.println("반올림 후 값 : " + sum / 10 * 10);

	}

}
