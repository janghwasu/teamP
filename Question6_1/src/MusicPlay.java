import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();
		
		System.out.println("====�����÷��̾�====");
		while (true) {
			System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====���====");
			} else if (choice == 2) {
				System.out.println("====�뷡���====");
			} else if (choice == 3) {
				System.out.println("====����====");
			} else if (choice == 4) {
				System.out.println("====������====");
			} else if (choice == 5) {
				System.out.println("====������====");
			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�.");
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
			}

		}
	}

}
