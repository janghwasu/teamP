package java0610;

public class MainPocketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pocketmon pika = new Pocketmon("피카츄", "백만볼트", 1000, 1, 200, 2000);

//		System.out.println(pika.getName());
//		System.out.println(pika.getSkill());
//		System.out.println(pika.getHp());
//		System.out.println(pika.getAttack());
//		System.out.println(pika.getLevel());
//		System.out.println(pika.getSpeed());

		Pocketmon kkobuk = new Pocketmon("꼬북이", "물대포", 500, 1, 200, 1000);

		// 피카츄가 꼬북이를 공격해서 HP를 깎게 만들어주세요.
		// 1. 피카츄의 공격력
		// 2. 공격력만큼 꼬북이는 HP를 깎아야 함.
		// 3. 공격받은 HP를 다시 꼬북이의 HP로 만들어줘야함.

		System.out.println(pika.getAttack());
		int damage = kkobuk.getHp() - pika.getAttack();
		System.out.println(damage);
		kkobuk.setHp(damage);
		System.out.print(kkobuk.getHp());
		System.out.println();
		
		// 피카츄의 레벨을 10으로 올려주세요.
		
		System.out.println(pika.getLevel());
		pika.setLevel(10);
		System.out.println(pika.getLevel());
		System.out.println(pika.getName());
		System.out.println(kkobuk.getName());
	}

}
