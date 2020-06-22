package java0617º¸Ãæ;

public class PartTimeEmployee extends Employee {

	private int workday;

	public PartTimeEmployee(String empNO, String name, int pay, int workday) {
		super();
		this.empNO = empNO;
		this.name = name;
		this.pay = pay;
		this.workday = workday;
	}

	public int getWorkday() {
		return workday;
	}

	public int calculate() {

		return pay * workday;
	}

}
