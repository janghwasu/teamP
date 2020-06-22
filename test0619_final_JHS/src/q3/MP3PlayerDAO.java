package q3;

public abstract class MP3PlayerDAO {

	public abstract void powerOnOff(); // 전원기능

	public abstract void play(); // 재생기능

	public abstract void stop(); // 정지기능

	public int remove; // 삭제기능

	public MP3PlayerDAO(int remove) {
		super();
		this.remove = remove;
	}

	public int getRemove() {
		return remove;
	}

	public void setRemove(int remove) {
		this.remove = remove;
	}

}
