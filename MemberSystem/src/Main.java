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

			System.out.println("[1]로그인  [2]회원가입  [3]선택조회 [4]전체조회 [5]선택삭제 [6]종료  >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====로그인====");
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				String pw = sc.next();

				MemberVO vo = new MemberVO(id, pw);

				String name = dao.login(vo);

				if (name != null) {
					System.out.println(name + "님 환영합니다!");

				} else {
					System.out.println("로그인에 실패했습니다...");
				}

			} else if (choice == 2) {
				System.out.println("====회원가입====");
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호");
				String pw = sc.next();
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("나이 : ");
				int age = sc.nextInt();

				MemberVO vo = new MemberVO(id, pw, name, age);
				int cnt = dao.join(vo);

				if (cnt > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패...");
				}

			} else if (choice == 3) {
				System.out.println("====선택조회====");
				System.out.println("아이디 : ");
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

				System.out.println("====전체조회====");
				// 1. 아이디 이름 나이 순으로 출력

				ArrayList<MemberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ".\t");
					System.out.print(list.get(i).getId() + "\t");
					System.out.print(list.get(i).getName() + "\t");
					System.out.println(list.get(i).getAge() + "\t");
				}

			} else if (choice == 5) {
				System.out.println("====선택삭제====");
				System.out.println("삭제할 아이디 입력 : ");
				String id = sc.next();

				ArrayList<MemberVO> list = dao.selectAll();
				for (int i = 0; i < list.size(); i++) {
					if (id.equals(list.get(i).getId())) {

						System.out.print(i + 1 + ". ");
						System.out.print(list.get(i).getId() + "\t");
						System.out.print(list.get(i).getName() + "\t");
						System.out.print(list.get(i).getAge() + "\t");
						System.out.println("가 삭제되었습니다.");

						// String del_id = dao.sel_delete(id);

					} else if (choice == 6) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}

				}
			}

		}
	}
}
