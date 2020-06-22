package java0610;

public class VOtestMain {

	public static void main(String[] args) {

		PersonVO person1 = new PersonVO();
		PersonVO person2 = new PersonVO("장화수", 20, "010-2222-1234");
		PersonVO person3 = new PersonVO("신", 21, "010-1111-3333");

//		System.out.println(person1.getName());
//		System.out.println(person2.getName());

		PersonVO[] personArr = new PersonVO[3]; // 배열 생성

		personArr[0] = new PersonVO("장화수", 20, "010-1111-2222"); // 객체 생성
		personArr[1] = new PersonVO("장화수1", 21, "010-3333-2222");
		personArr[2] = new PersonVO("장화수2", 25, "010-3434-3434");

		for (int i = 0; i < personArr.length; i++) {
			System.out.println(personArr[i].getName());
		}
	}
}
