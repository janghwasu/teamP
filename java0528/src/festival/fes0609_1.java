package festival;

public class fes0609_1 {

	public static void main(String[] args) {
		// �� ���� ������ �Ű������� �޾� ���� ������
		// ���� ������ �������������� �Ǻ��ϴ� �޼ҵ� isDivide( ) �� �ۼ��ϼ���. �̶�, ���������� true,
		// ���������� ������ false�� ��ȯ��

		int num1 = 10;
		int num2 = 6;
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else if (num1 % num2 == 1) {

		}
		return false;

	}

}