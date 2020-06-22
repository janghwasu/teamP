package java0610;

public class Pocketmon {

	private String name; // 속성
	private String skill;
	private int attack;
	private int level;
	private int hp;
	private int speed;

	// 생성자는 클래스 이름과 같아야 한다. method와 비슷하나 return 타입이 없다. 이런 형식이 생성자!
	public Pocketmon(String name, String skill, int attack, int level, int hp, int speed) { // 매개변수
		this.name = name; // this.name은 속성 뒤에 name은 매개변수
		this.skill = skill;
		this.attack = attack;
		this.level = level;
		this.hp = hp;
		this.speed = speed;

	}

	// 각각의 속성들을 return해주는 method 만들기
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

	// 각각의 속성들의 값을 다시 입혀주는 method를 작성
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
			name = "라이츄";
		}
	}public void setHp(int hp) {
		this.hp = hp;
	}public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
	
	
	
}
