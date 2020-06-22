package java0610;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();

		Person p2 = new Person("ÀåÈ­¼ö", 20);
		System.out.println(p2.name);
		System.out.println(p2.age);

		Person p3 = new Person(15);
		System.out.println(p3.name);
		System.out.println(p3.age);
		

		Person p4 = new Person("½Å");
		System.out.println(p4.name);
		System.out.println(p4.age);

		Person p5 = new Person("±è");
		System.out.println(p5.name);
		System.out.println(p5.age);

	}

}
