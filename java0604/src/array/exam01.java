package array;

public class exam01 {

	public static void main(String[] args) {
		// �迭(Array) : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		// ���̽���� ���̴� ������ Ÿ���̶�� ���� ������

		// �迭�� ����
		int[] intArray; // �����Ҷ� ���� �Ҵ��Ű�� �ȵ�

		// �迭�� ����

		intArray = new int[5]; // new Ű���尡 �迭�� �����ð� ������ �Ҵ� ��ų �� ����

		// �迭 �ּ� ���
		System.out.println(intArray);

		int[] temp = intArray;

		temp[1] = 15;
		System.out.println(temp[1]);
		System.out.println(intArray[1]);
		int num1 = 10;
		int mun2 = num1;


		
		System.out.println(intArray.length);
		
	}

}
