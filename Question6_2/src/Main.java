import java.awt.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		while (true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====����������====");
				
				controller.getList()
				
			
			} else if (choice == 2) {
				System.out.println("====�̿�Ǻ���====");
			} else if (choice == 3) {
				System.out.println("====������====");
			} else if (choice == 4) {
				System.out.println("====��������====");

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
		}
	}

}
