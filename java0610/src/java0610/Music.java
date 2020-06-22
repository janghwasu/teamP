package java0610;

public class Music {

	private String musicName;
	private String singer;
	private int playTime;

	public Music(String musicName, String singer, int playTime) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}

	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

}
