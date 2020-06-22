import java.util.ArrayList;
import java.util.Scanner;

public class Contact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addlist = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]�߰�  [2]��ü��ȸ  [3]����  [4]�˻�  [5]���� >> ");
			int num = sc.nextInt();
			if (num == 5) {
				System.out.println("���α׷� ����");
				break;
			} else if (num == 1) {

				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc.next();

				Address ad = new Address(name, age, phoneNumber);

				addlist.add(ad);

			} else if (num == 2) {

				if (addlist.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else if (addlist.size() > 0) {
					for (int i = 0; i < addlist.size(); i++) {
						System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
								+ "��) : " + addlist.get(i).getPhoneNumber());
					}

				}

			} else if (num == 3) {
				if (addlist.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else if (addlist.size() > 0) {
					for (int i = 0; i < addlist.size(); i++) {
						System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
								+ "��) : " + addlist.get(i).getPhoneNumber());

					}
					System.out.println("������ ��ȣ �Է� : ");
					int delete = sc.nextInt();

					addlist.remove(delete - 1);
				}
				System.out.println("���� �Ϸ�");

			} else if (num == 4) {
				if (addlist.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				} else if (addlist.size() > 0) {
					System.out.println("�˻��� �̸� �Է� : ");
					String find = sc.next();
					boolean ch = false;
					for (int i = 0; i < addlist.size(); i++) {
						if (find.equals(addlist.get(i).getName())) {

							System.out.println(i + 1 + ". " + addlist.get(i).getName() + "(" + addlist.get(i).getAge()
									+ "��) : " + addlist.get(i).getPhoneNumber());
							ch = !ch;

						}

					}
					if (!ch) {
						System.out.println("�˻��� �̸��� ������ �����ϴ�.");
					}

				}
			}

		}

	}
}
