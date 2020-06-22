package java0610;

public class BankBook {

	private int money;

	public void Deposit(int money2) {
		money += money2;
		System.out.println("돈을 넣는다.");

	}

	public void Withdraw(int money2) {
		money -= money2;
		System.out.println("돈을 인출한다.");
	}

	public void ShowMoney() {
		System.out.println(money + "원이 남아 있습니다.");
	}

}
