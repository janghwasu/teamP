package java0610;

public class VOtestMain {

	public static void main(String[] args) {

		PersonVO person1 = new PersonVO();
		PersonVO person2 = new PersonVO("��ȭ��", 20, "010-2222-1234");
		PersonVO person3 = new PersonVO("��", 21, "010-1111-3333");

//		System.out.println(person1.getName());
//		System.out.println(person2.getName());

		PersonVO[] personArr = new PersonVO[3]; // �迭 ����

		personArr[0] = new PersonVO("��ȭ��", 20, "010-1111-2222"); // ��ü ����
		personArr[1] = new PersonVO("��ȭ��1", 21, "010-3333-2222");
		personArr[2] = new PersonVO("��ȭ��2", 25, "010-3434-3434");

		for (int i = 0; i < personArr.length; i++) {
			System.out.println(personArr[i].getName());
		}
	}
}
