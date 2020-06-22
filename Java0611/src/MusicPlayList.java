import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> musicList = new ArrayList<String>();

//		musicList.add("��");
//		musicList.add("�ò���");
//		musicList.add("�ֶ��ֶ�");

		while (true) {
			System.out.print("[1]�뷡�߰�  [2]�뷡����  [3]�뷡��ȸ  [4]����  >>");
			int menu = sc.nextInt();

			System.out.println("======== ���� ��� ��� ========");

			if (menu == 4) {
				System.out.println("���α׷� ����Ǿ����ϴ�.");
				break;
			} else if (menu == 1) {
				if (musicList.size() == 0)
					System.out.println("��� ����� �����ϴ�.");
				else if (musicList.size() != 0) {
					for (int i = 0; i < musicList.size(); i++)
						System.out.println(i + 1 + ". " + musicList.get(i));

				}
				System.out.print("[1]������ ��ġ�� �߰�  [2]���ϴ� ��ġ�� �߰� >> ");
				int ad = sc.nextInt();
				System.out.println("�߰��� �뷡 �Է� >> ");
				String song = sc.next();
				if (ad == 1) {
					musicList.add(song);
				} else if (ad == 2) {
					System.out.print("���� >>");
					int index = sc.nextInt();

					musicList.add(index - 1, song);
				}
				System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
			} else if (menu == 2) {
				if (musicList.size() > 0) {
					for (int i = 0; i < musicList.size(); i++)
						System.out.println(i + 1 + ". " + musicList.get(i));
					System.out.print("[1]���û���  [2]��ü���� >> ");
					int remove = sc.nextInt();
					if (remove == 2) {
						musicList.clear();
					} else if (remove == 1) {
						System.out.print("������ �뷡 ����>>");
						int select_song = sc.nextInt();
						musicList.remove(select_song - 1);
					}
					System.out.println("�뷡�� �����Ǿ����ϴ�.");

				} else if (musicList.size() == 0) {
					System.out.println("��� ����� �����ϴ�.");
				}
			} else if (menu == 3) {
				if (musicList.size() == 0)
					System.out.println("��� ����� �����ϴ�.");
				for (int i = 0; i < musicList.size(); i++)
					System.out.println(i + 1 + ". " + musicList.get(i));
			}

			System.out.println("===========================");

		}
		sc.close();
	}
}
