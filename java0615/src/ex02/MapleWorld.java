package ex02;

public class MapleWorld {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Warrior warrior = new Warrior();
		Thief thief = new Thief();

		Basic[] basics = new Basic[3];
		basics[0] = wizard;
		basics[1] = warrior;
		basics[2] = thief;

		basics[1].attck();
		basics[1].move();
		
	}

}
