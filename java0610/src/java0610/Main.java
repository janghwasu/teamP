package java0610;

public class Main {

	public static void main(String[] args) {

//		// ��ü�� ����, Ŭ������ �ν��Ͻ�ȭ
//		People p = new People();
//
//		// ��ä�� �Ӽ��� ����
//		p.name = "��ȭ��";
//		System.out.println(p.name);
//
//		p.age = 20;
//		System.out.println(p.age);
//
//		p.height = 180;
//		System.out.println(p.height);
//
//		p.sex = "male";
//		System.out.println(p.sex);
//
//		People JangHS = new People();
//		System.out.println(JangHS.name);
//		JangHS.age = 22;
//		JangHS.name = "��1";
//		JangHS.height = 280;
//		JangHS.sex = "MALE";
//		System.out.println(JangHS.name + JangHS.age + JangHS.height + JangHS.sex);
//
//		// ��ü�� ���� ����� ���
//		p.Hi();
//		p.Shower();
//		p.Run();

		// BankBook ��ü�� ����

		BankBook b = new BankBook();

		
		b.ShowMoney();
		// �Ű������� �ݾ��� �Է¹޾Ƽ� ������ �غ��ڽ��ϴ�.
		b.Deposit(10000);
		b.ShowMoney();

		b.Withdraw(5200);
		b.ShowMoney();
		
		
		b.Deposit(10);
		b.ShowMoney();
		
		
		
		
		
		
		
		
		
		
	}

}
