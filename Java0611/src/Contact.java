import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addlist = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가  [2]전체조회  [3]삭제  [4]검색  [5]종료 >> ");
			int num = sc.nextInt();
			if (num == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (num == 1) {

				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Address ad = new Address(name, age, phoneNumber);

				addlist.add(ad);

			} else if (num == 2) {

				if (addlist.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else if (addlist.size() > 0) {
					for (int i = 0; i < addlist.size(); i++) {
						System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
								+ "세) : " + addlist.get(i).getPhoneNumber());
					}

				}

			} else if (num == 3) {
				if (addlist.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else if (addlist.size() > 0) {
					for (int i = 0; i < addlist.size(); i++) {
						System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
								+ "세) : " + addlist.get(i).getPhoneNumber());

					}
					System.out.println("삭제할 번호 입력 : ");
					int delete = sc.nextInt();

					addlist.remove(delete - 1);
				}
				System.out.println("삭제 완료");

			} else if (num == 4) {
				if (addlist.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else if (addlist.size() > 0) {
					System.out.println("검색할 이름 입력 : ");
					String find = sc.next();
					boolean ch = false;
					for (int i = 0; i < addlist.size(); i++) {
						if (find.equals(addlist.get(i).getName())) {

							System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
									+ "세) : " + addlist.get(i).getPhoneNumber());
							ch = !ch;

						}

					}
					if (!ch) {
						System.out.println("검색한 이름의 정보가 없습니다.");
					}

				}
			}

		}

	}
}
