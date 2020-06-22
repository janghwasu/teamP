package java0617보충;

public abstract class Employee {

	String empNO;
	String name;
	int pay;

	public abstract int calculate();

	// 추상화 abstract를 사용하려면 강제로 calculate를 사용 해야하는 강제성이 있음
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
