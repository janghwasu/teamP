package java0610;

import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData[] bdArr = new BookData[5];

		bdArr[0] = new BookData("Java", 29000, "ȫ�浿");
		bdArr[1] = new BookData("C++", 29000, "�ڹ���");
		bdArr[2] = new BookData("Database", 31000, "���嵶");
		bdArr[3] = new BookData("Android", 18000, "�̼���");
		bdArr[4] = new BookData("Web", 26000, "��ö��");

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int price = sc.nextInt();
		sc.close();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bdArr.length; i++) {

			if (price >= bdArr[i].getPrice()) {
				System.out.println("[" + bdArr[i].getTitle() + ", " + bdArr[i].getWriter() + ", " + bdArr[i].getPrice() + "�� ]");
			}

		}
	}

}
