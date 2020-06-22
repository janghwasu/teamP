import java.util.ArrayList;
import java.util.Scanner;

public class Product {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product_field> list = new ArrayList<Product_field>();

		while (true) {

			System.out.print("[1]물건 추가  [2]예상 판매량 조회  [3]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 3) {
				System.out.println("프로그램 종료");
				break;
			} else if (menu == 1) {
				System.out.print("물건이름 : ");
				String name = sc.next();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();

				Product_field pro = new Product_field(name, unitPrice, amount);

				list.add(pro);

			} else if (menu == 2) {
				if (list.size() > 0) {

					System.out.println("제품명" + "\t" + "단가" + "\t" + "수량");

					for (int i = 0; i < list.size(); i++) {

						System.out.println(list.get(i).getName() + "\t" + list.get(i).getUnitPrice() + "\t"
								+ list.get(i).getAmount() + "개");

					}
					int sum = 0;
					for (int i = 0; i < list.size(); i++) {
						sum += list.get(i).getUnitPrice() * list.get(i).getAmount();
					}
					System.out.println("판매시 매출 : " + sum + "원");
				}else {
					System.out.println("추가된 물건이 없습니다.");
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
