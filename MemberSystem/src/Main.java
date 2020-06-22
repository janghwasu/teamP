import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MemberDAO dao = new MemberDAO();

		while (true) {

			System.out.println("[1]�α���  [2]ȸ������  [3]������ȸ [4]��ü��ȸ [5]���û��� [6]����  >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====�α���====");
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				String pw = sc.next();

				MemberVO vo = new MemberVO(id, pw);

				String name = dao.login(vo);

				if (name != null) {
					System.out.println(name + "�� ȯ���մϴ�!");

				} else {
					System.out.println("�α��ο� �����߽��ϴ�...");
				}

			} else if (choice == 2) {
				System.out.println("====ȸ������====");
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ");
				String pw = sc.next();
				System.out.println("�̸� : ");
				String name = sc.next();
				System.out.println("���� : ");
				int age = sc.nextInt();

				MemberVO vo = new MemberVO(id, pw, name, age);
				int cnt = dao.join(vo);

				if (cnt > 0) {
					System.out.println("ȸ������ ����!");
				} else {
					System.out.println("ȸ������ ����...");
				}

			} else if (choice == 3) {
				System.out.println("====������ȸ====");
				System.out.println("���̵� : ");
				String id = sc.next();

				ArrayList<MemberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {
						System.out.print(i + 1 + ". ");
						System.out.print(list.get(i).getId() + "\t");
						System.out.print(list.get(i).getName() + "\t");
						System.out.println(list.get(i).getAge() + "\t");
					}
				}

			} else if (choice == 4) {

				System.out.println("====��ü��ȸ====");
				// 1. ���̵� �̸� ���� ������ ���

				ArrayList<MemberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ".\t");
					System.out.print(list.get(i).getId() + "\t");
					System.out.print(list.get(i).getName() + "\t");
					System.out.println(list.get(i).getAge() + "\t");
				}

			} else if (choice == 5) {
				System.out.println("====���û���====");
				System.out.println("������ ���̵� �Է� : ");
				String id = sc.next();

				ArrayList<MemberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {

						System.out.print(i + 1 + ". ");
						System.out.print(list.get(i).getId() + "\t");
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getAge() + "\t");
						System.out.println("�� �����Ǿ����ϴ�.");

						// String del_id = dao.sel_delete(id);

					} else if (choice == 6) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}

				}
			}

		}
	}
}
