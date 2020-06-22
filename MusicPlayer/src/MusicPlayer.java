import javazoom.jl.player.MP3Player;

public class MusicPlayer {
//컨트롤러 클래스
	Music[] music = new Music[3];
	MP3Player mp3 = new MP3Player();
	int curIndex = 0;

	public MusicPlayer() {
		music[0] = new Music("달라달라", "잇지", 120, "C://music/Itzy - Dalla Dalla.mp3");
		music[1] = new Music("깡", "비", 100, "C://music/Rain - 깡.mp3");
		music[2] = new Music("솔로", "제니", 200, "C://music/JENNIE - SOLO.mp3");
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
		return "노래가 정지되었습니다.";
	}
}
