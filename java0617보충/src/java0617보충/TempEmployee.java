package java0617º¸Ãæ;

public class TempEmployee extends Employee {

	public TempEmployee(String empNO, String name, int pay) {
		super();
		this.empNO = empNO;
		this.name = name;
		this.pay = pay;
	}

	public int calculate() {

		return pay / 12;
	}

}
