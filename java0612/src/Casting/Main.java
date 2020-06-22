package Casting;

public class Main {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.eat();
		Dog dog = new Dog();
		
		// upcasting
		Animal ani2 = new Dog();
		ani2.eat();
		
		Animal cat = new Cat();
		cat.eat();
	
		ani.eat();
		cat.eat();
		ani2.eat();
		
		//downcasting
		
		Dog d = (Dog)ani2;
		d.move();
		
	}
}
