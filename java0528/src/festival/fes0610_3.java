package festival;

public class fes0610_3 {

	public static void main(String[] args) {
		// 아래와 같이 학생들의 성적정보가 문자열로
		// 선언되어 있을 때 각 성적 별 학생 수를 출력하시오.

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] score1 = score.split(",");

		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;

		for (int i = 0; i < score1.length; i++) {
			if (score1[i].equals("A")) {
				A += 1;
			} else if (score1[i].equals("B")) {
				B += 1;
			} else if (score1[i].equals("C")) {
				C += 1;
			} else if (score1[i].equals("D")) {
				D += 1;
			} else if (score1[i].equals("F")) {
				F += 1;

			}

		}
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");
	}
}
