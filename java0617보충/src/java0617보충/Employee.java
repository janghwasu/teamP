package java0617����;

public abstract class Employee {

	String empNO;
	String name;
	int pay;

	public abstract int calculate();

	// �߻�ȭ abstract�� ����Ϸ��� ������ calculate�� ��� �ؾ��ϴ� �������� ����
	public String getEmpNO() {
		return empNO;
	}

	public String getName() {
		return name;
	}

	public int getPay() {
		return pay;
	}
}
