package Casting2;

public class Main {

	public static void main(String[] args) {
		WildAnimal ani = new Lion();
//		ani.hunt();

		WildAnimal[] aniArr = new WildAnimal[3];
		aniArr[0] = new Wolf();
		aniArr[1] = new Eagle();
		aniArr[2] = new Lion();

		for (int i = 0; i < aniArr.length; i++) {
			aniArr[i].hunt();
		}
	}

}
