import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product_field> list = new ArrayList<Product_field>();

		while (true) {

			System.out.print("[1]���� �߰�  [2]���� �Ǹŷ� ��ȸ  [3]���� >> ");
			int menu = sc.nextInt();

			if (menu == 3) {
				System.out.println("���α׷� ����");
				break;
			} else if (menu == 1) {
				System.out.print("�����̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int amount = sc.nextInt();
				System.out.print("�ܰ� : ");
				int unitPrice = sc.nextInt();

				Product_field pro = new Product_field(name, unitPrice, amount);

				list.add(pro);

			} else if (menu == 2) {
				if (list.size() > 0) {

					System.out.println("��ǰ��" + "\t" + "�ܰ�" + "\t" + "����");

					for (int i = 0; i < list.size(); i++) {

						System.out.println(list.get(i).getName() + "\t" + list.get(i).getUnitPrice() + "\t"
								+ list.get(i).getAmount() + "��");

					}
					int sum = 0;
					for (int i = 0; i < list.size(); i++) {
						sum += list.get(i).getUnitPrice() * list.get(i).getAmount();
					}
					System.out.println("�ǸŽ� ���� : " + sum + "��");
				}else {
					System.out.println("�߰��� ������ �����ϴ�.");
				}
			}

		}
		sc.close();
	}

	private static Product_field Product_field(String name, int unitPrice, int amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
