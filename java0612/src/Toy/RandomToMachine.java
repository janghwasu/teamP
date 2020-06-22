package Toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToMachine {
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	Random r = new Random();

	public Toy getToy() {

		int randomIndex = r.nextInt(toyList.size());

		return toyList.get(randomIndex);
	}

	public void addToy(Toy toy) {

		toyList.add(toy);

	}

}
