package array;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 23, 4, 36, 36, 46, 24, 33, 24, 24, 53, 56, 46, 54, 23 };
		int max = array[0]; // array�� ù��° �Լ��� ��
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("���� ū ���� " + max + " �Դϴ�.");

	}

}
