import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> musicList = new ArrayList<String>();

//		musicList.add("깡");
//		musicList.add("시끄러");
//		musicList.add("주라주라");

		while (true) {
			System.out.print("[1]노래추가  [2]노래삭제  [3]노래조회  [4]종료  >>");
			int menu = sc.nextInt();

			System.out.println("======== 현재 재생 목록 ========");

			if (menu == 4) {
				System.out.println("프로그램 종료되었습니다.");
				break;
			} else if (menu == 1) {
				if (musicList.size() == 0)
					System.out.println("재생 목록이 없습니다.");
				else if (musicList.size() != 0) {
					for (int i = 0; i < musicList.size(); i++)
						System.out.println(i + 1 + ". " + musicList.get(i));

				}
				System.out.print("[1]마지막 위치에 추가  [2]원하는 위치에 추가 >> ");
				int ad = sc.nextInt();
				System.out.println("추가할 노래 입력 >> ");
				String song = sc.next();
				if (ad == 1) {
					musicList.add(song);
				} else if (ad == 2) {
					System.out.print("순서 >>");
					int index = sc.nextInt();

					musicList.add(index - 1, song);
				}
				System.out.println("추가가 완료되었습니다.");
			} else if (menu == 2) {
				if (musicList.size() > 0) {
					for (int i = 0; i < musicList.size(); i++)
						System.out.println(i + 1 + ". " + musicList.get(i));
					System.out.print("[1]선택삭제  [2]전체삭제 >> ");
					int remove = sc.nextInt();
					if (remove == 2) {
						musicList.clear();
					} else if (remove == 1) {
						System.out.print("삭제할 노래 선택>>");
						int select_song = sc.nextInt();
						musicList.remove(select_song - 1);
					}
					System.out.println("노래가 삭제되었습니다.");

				} else if (musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				}
			} else if (menu == 3) {
				if (musicList.size() == 0)
					System.out.println("재생 목록이 없습니다.");
				for (int i = 0; i < musicList.size(); i++)
					System.out.println(i + 1 + ". " + musicList.get(i));
			}

			System.out.println("===========================");

		}
		sc.close();
	}
}
