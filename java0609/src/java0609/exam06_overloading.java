package java0609;

public class exam06_overloading {

	public static void main(String[] args) {

		// �Ű� ������ ������ Ÿ���� �ٸ� �� ��� ����
		// �����ε� == �ߺ�����

		int result = add('+', 1);
		System.out.println(result);

	}

	public static int add(float i, float j) {
		return (int) (i + j);

	}

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public static int add(int i, int j, int z) {
		return i + j + z;
	}

	public static int add(char op, int i) {
		if (op == '+') {
			return i + 1;
		} else {
			return 0;
		}

	}
}
