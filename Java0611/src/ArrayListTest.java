import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();

		// ������ �߰� (add�� Ȱ��)
		list.add("���");
		list.add("����");

		// ������ ��������(get�� Ȱ��)
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// ���ϴ� ��ġ�� ������ �߰�
		list.add(1, "��");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// ��� ����
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// ��� ��ü ����
		list.clear();
		
		// ��� ���� Ȯ��
		System.out.println(list.size());
		
		
	}

}
