import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();
		
		System.out.println("====뮤직플레이어====");
		while (true) {
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====등록====");
			} else if (choice == 2) {
				System.out.println("====노래목록====");
			} else if (choice == 3) {
				System.out.println("====실행====");
			} else if (choice == 4) {
				System.out.println("====이전곡====");
			} else if (choice == 5) {
				System.out.println("====다음곡====");
			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}

		}
	}

}
