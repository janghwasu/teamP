package java0609;

public class exam01_method {

	public static void main(String[] args) {

		System.out.println(num(5, 4));
		print(4);
		printName();

	}

	public static int num(int i, int j) {
		return i + 1 + j;

	}

	// void �� return type �� ��� �ȴ�.
	public static void print(int i) {
		System.out.println("���� �����ϴ� ���ڴ�  " + i + "�Դϴ�.");
		System.out.println("hi");

		// �Ű������� ���� method

	}

	public static void printName() {
		System.out.println("�� �̸��� ��ȭ���Դϴ�.");

	}

}
