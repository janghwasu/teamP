package festival;

public class fes0610_3 {

	public static void main(String[] args) {
		// �Ʒ��� ���� �л����� ���������� ���ڿ���
		// ����Ǿ� ���� �� �� ���� �� �л� ���� ����Ͻÿ�.

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
		System.out.println("A : " + A + "��");
		System.out.println("B : " + B + "��");
		System.out.println("C : " + C + "��");
		System.out.println("D : " + D + "��");
		System.out.println("F : " + F + "��");
	}
}
