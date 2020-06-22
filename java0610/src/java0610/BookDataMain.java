package java0610;

import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData[] bdArr = new BookData[5];

		bdArr[0] = new BookData("Java", 29000, "홍길동");
		bdArr[1] = new BookData("C++", 29000, "박문수");
		bdArr[2] = new BookData("Database", 31000, "김장독");
		bdArr[3] = new BookData("Android", 18000, "이순신");
		bdArr[4] = new BookData("Web", 26000, "김철수");

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int price = sc.nextInt();
		sc.close();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bdArr.length; i++) {

			if (price >= bdArr[i].getPrice()) {
				System.out.println("[" + bdArr[i].getTitle() + ", " + bdArr[i].getWriter() + ", " + bdArr[i].getPrice() + "원 ]");
			}

		}
	}

}
