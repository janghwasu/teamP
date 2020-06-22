
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MusicPlayer player = new MusicPlayer(); // ��ü ����

		while (true) {

			System.out.print("1.���  2.����  3.������  4.������  5.����  >> ");
			int menu = sc.nextInt();

			if (menu == 5) {
				System.out.println("���α׷� ����");
				String s = player.stop();
				break;
			} else if (menu == 1) {
				Music m = player.play();
				System.out.println(printMusicInfo(m));
			} else if (menu == 3) {
				
				Music m = player.nextPlay();
				System.out.println(printMusicInfo(m));
			} else if (menu == 4) {
				
				Music m = player.prePlay();
				System.out.println(printMusicInfo(m));

			} else if (menu == 2) {
				String s = player.stop();
				System.out.println(s);

			}

		}
	}

	private static String printMusicInfo(Music m) {
		return m.getMusicName() + ", " + m.getSinger() + ", "
				+ (m.getPlayTime() / 60 + "��" + m.getPlayTime() % 60 + "��");
	}
}