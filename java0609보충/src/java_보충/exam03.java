package java_보충;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] names = { "안대주", "박수현", "김선경", "장화수" };
		System.out.print("검색 할 이름을 입력하세요. >> ");
		String name = sc.next();
		sc.close();

//		boolean ch = false; // boolean 형으로 없는 데이터 필터링
		int i = 0;
		for (i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(name + "님은 " + (i + 1) + "번 째 인덱스에 저장되어 있습니다.");
				break;
//				ch = !ch;

			}
		}
		if (i == names.length) {
			System.out.println(name + "는 존재하지 않습니다.");
		}

//		if (!ch) {
//			System.out.println(name + "는 존재하지 않습니다.");
//		}
	}
}