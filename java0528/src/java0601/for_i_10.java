package java0601;

public class for_i_10 {

	public static void main(String[] args) {
		// 1~10까지 출력
//		for (int i = 21; i <= 57; i++) {
//			System.out.print(i + " ");
//		}

//		for (int i =96; i >= 53; i--) {
//			System.out.print(i + " ");
//		}

		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		for (int i = 21; i <= 57; i += 2) {   //2 씩 증가
		
				System.out.print(i + " ");
			

		}
	}
}