import java.util.ArrayList;

public class StoreController {
	private ArrayList<Store> list = new ArrayList<Store>();

	public StoreController() {
		Restaurant r1 = new Restaurant("�ؼ��Ĵ�", "������", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("�����̳�", "������", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("�ջ����", "������", 90, 90, 90, 34);
		Salon s1 = new Salon("�ڽ�ö", "�̿��", 100, 100, 67.99);
		Salon s2 = new Salon("�̰���", "�̿��", 100, 100, 70.99);
		Salon s3 = new Salon("����", "�̿��", 87, 87, 87);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

	public ArrayList<Store> getList() {
		// ���� ����Ʈ�� �������� ���
		return null;
	}

	public ArrayList<Store> getStore(String searchStore) {
		// ���������
		return null;
	}

}
