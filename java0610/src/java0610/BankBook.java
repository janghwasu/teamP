package java0610;

public class BankBook {

	private int money;

	public void Deposit(int money2) {
		money += money2;
		System.out.println("���� �ִ´�.");

	}

	public void Withdraw(int money2) {
		money -= money2;
		System.out.println("���� �����Ѵ�.");
	}

	public void ShowMoney() {
		System.out.println(money + "���� ���� �ֽ��ϴ�.");
	}

}
