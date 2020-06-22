package q3;

public class MP3Player {

	private String name; // 모델명
	private String color; // 색상
	private boolean power; // 전원상태

	public MP3Player(String name, String color, boolean power) {
		super();
		this.name = name;
		this.color = color;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

}
