package java0610;

public class Pocketmon {

	private String name; // �Ӽ�
	private String skill;
	private int attack;
	private int level;
	private int hp;
	private int speed;

	// �����ڴ� Ŭ���� �̸��� ���ƾ� �Ѵ�. method�� ����ϳ� return Ÿ���� ����. �̷� ������ ������!
	public Pocketmon(String name, String skill, int attack, int level, int hp, int speed) { // �Ű�����
		this.name = name; // this.name�� �Ӽ� �ڿ� name�� �Ű�����
		this.skill = skill;
		this.attack = attack;
		this.level = level;
		this.hp = hp;
		this.speed = speed;

	}

	// ������ �Ӽ����� return���ִ� method �����
	// getName, getSkill,,,,,

	public String getName() {
		return name;
	}public String getSkill() {
		return skill;
	}public int getAttack() {
		return attack;
	}public int getLevel() {
		return level;
	}public int getHp() {
		return hp;
	}public int getSpeed() {
		return speed;
	}

	// ������ �Ӽ����� ���� �ٽ� �����ִ� method�� �ۼ�
	// setName, setSkill,,,,
	
	public void setName(String name) {
		this.name = name;		
	}public void setSkill(String skill) {
		this.skill = skill;
	}public void setAttack(int attack) {
		this.attack = attack;
	}public void setLevel(int level) {
		this.level = level;
		if(this.level >= 10) {
			name = "������";
		}
	}public void setHp(int hp) {
		this.hp = hp;
	}public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
	
	
	
}
