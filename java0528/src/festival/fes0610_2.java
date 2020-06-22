package festival;

import java.util.Scanner;

public class fes0610_2 {

	public static void main(String[] args) {
		// 그림과 같이 대시(‘-’)문자로 구성된 형태의 숫자를
		// 주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
		// 대시의 개수를 출력하는 프로그램을 작성하라

		Scanner sc = new Scanner(System.in);

		System.out.println("첫자리 0을 제외한 숫자를 입력해주세요 >>");
		String num = sc.next();

		int sum = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.substring(i, i + 1).equals("1")) {
				sum += 2;
			} else if (num.substring(i, i + 1).equals("7")) {
				sum += 3;
			} else if (num.substring(i, i + 1).equals("4")) {
				sum += 4;
			} else if (num.substring(i, i + 1).equals("2") || num.substring(i, i + 1).equals("3")
					|| num.substring(i, i + 1).equals("5")) {
				sum += 5;
			} else if (num.substring(i, i + 1).equals("6") || num.substring(i, i + 1).equals("9")) {
				sum += 6;
			} else if (num.substring(i, i + 1).equals("8")) {
				sum += 7;

			}
		}
		System.out.println("대시('-')의 총 합 >> " + sum);
	}
}
