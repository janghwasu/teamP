package java0610;

public class Main {

	public static void main(String[] args) {

//		// 객체를 생성, 클래스의 인스턴스화
//		People p = new People();
//
//		// 객채의 속성에 접근
//		p.name = "장화수";
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
//		JangHS.name = "장1";
//		JangHS.height = 280;
//		JangHS.sex = "MALE";
//		System.out.println(JangHS.name + JangHS.age + JangHS.height + JangHS.sex);
//
//		// 객체가 가진 기능을 사용
//		p.Hi();
//		p.Shower();
//		p.Run();

		// BankBook 객체를 생성

		BankBook b = new BankBook();

		
		b.ShowMoney();
		// 매개변수로 금액을 입력받아서 저금을 해보겠습니다.
		b.Deposit(10000);
		b.ShowMoney();

		b.Withdraw(5200);
		b.ShowMoney();
		
		
		b.Deposit(10);
		b.ShowMoney();
		
		
		
		
		
		
		
		
		
		
	}

}
