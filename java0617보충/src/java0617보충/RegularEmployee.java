package java0617º¸Ãæ;

public class RegularEmployee extends Employee {

	private int bonus;

	public RegularEmployee(String empNO, String name, int pay, int bonus) {
		super();
		this.empNO = empNO;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public int calculate() {

		return (pay + bonus) / 12;
	}

}
