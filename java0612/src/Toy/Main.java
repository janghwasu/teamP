package Toy;

public class Main {

	public static void main(String[] args) {

		RandomToMachine machine = new RandomToMachine();
		machine.addToy(new Ball());
		machine.addToy(new Gun());
		machine.addToy(new Train());
		machine.addToy(new Slime());
		
		Toy toy = machine.getToy();
		toy.play();
		
	}
}
