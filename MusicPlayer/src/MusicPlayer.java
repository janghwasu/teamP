import javazoom.jl.player.MP3Player;

public class MusicPlayer {
//��Ʈ�ѷ� Ŭ����
	Music[] music = new Music[3];
	MP3Player mp3 = new MP3Player();
	int curIndex = 0;

	public MusicPlayer() {
		music[0] = new Music("�޶�޶�", "����", 120, "C://music/Itzy - Dalla Dalla.mp3");
		music[1] = new Music("��", "��", 100, "C://music/Rain - ��.mp3");
		music[2] = new Music("�ַ�", "����", 200, "C://music/JENNIE - SOLO.mp3");
	}

	public Music play() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(music[curIndex].getMusicPath());
		return music[curIndex];

	}

	public Music nextPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		curIndex++;
		if (curIndex == music.length) {
			curIndex = 0;
		}
		mp3.play(music[curIndex].getMusicPath());
		return music[curIndex];

	}

	public Music prePlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		curIndex--;
		if (curIndex == -1) {
			curIndex = music.length - 1;
		}
		mp3.play(music[curIndex].getMusicPath());
		return music[curIndex];
	}

	public String stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		return "�뷡�� �����Ǿ����ϴ�.";
	}
}
