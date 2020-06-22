package q3;

public abstract class MP3PlayerDAO {

	public abstract void powerOnOff(); // �������

	public abstract void play(); // ������

	public abstract void stop(); // �������

	public int remove; // �������

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
