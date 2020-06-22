package java0610;

public class Person {

	String name;
	int age;

	public Person() {
		System.out.println("default »ı¼ºÀÚ");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name) {
		this.name = name;
	}
}
