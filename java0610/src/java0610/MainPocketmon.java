package java0610;

public class MainPocketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pocketmon pika = new Pocketmon("��ī��", "�鸸��Ʈ", 1000, 1, 200, 2000);

//		System.out.println(pika.getName());
//		System.out.println(pika.getSkill());
//		System.out.println(pika.getHp());
//		System.out.println(pika.getAttack());
//		System.out.println(pika.getLevel());
//		System.out.println(pika.getSpeed());

		Pocketmon kkobuk = new Pocketmon("������", "������", 500, 1, 200, 1000);

		// ��ī�� �����̸� �����ؼ� HP�� ��� ������ּ���.
		// 1. ��ī���� ���ݷ�
		// 2. ���ݷ¸�ŭ �����̴� HP�� ��ƾ� ��.
		// 3. ���ݹ��� HP�� �ٽ� �������� HP�� ����������.

		System.out.println(pika.getAttack());
		int damage = kkobuk.getHp() - pika.getAttack();
		System.out.println(damage);
		kkobuk.setHp(damage);
		System.out.print(kkobuk.getHp());
		System.out.println();
		
		// ��ī���� ������ 10���� �÷��ּ���.
		
		System.out.println(pika.getLevel());
		pika.setLevel(10);
		System.out.println(pika.getLevel());
		System.out.println(pika.getName());
		System.out.println(kkobuk.getName());
	}

}
