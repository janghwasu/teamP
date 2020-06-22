package ex01;

import java.util.ArrayList;
import java.util.Random;

public class AnimalKingdom {
	public static void main(String[] args) {
		Cat cat = new Cat();

		Dog dog = new Dog();

		Deer deer = new Deer();

		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(cat);
		list.add(deer);
		list.add(dog);

		// 3개의 동물 중 랜덤으로 한개의 동물의 울음 메소드를 실행

//		Random r = new Random();
//
//		list.get(r.nextInt(list.size())).shouting();

		Cat cat2 = (Cat) list.get(0);
		cat2.moving();      
	}
}
