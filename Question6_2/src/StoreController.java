import java.util.ArrayList;

public class StoreController {
	private ArrayList<Store> list = new ArrayList<Store>();

	public StoreController() {
		Restaurant r1 = new Restaurant("해성식당", "음식점", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("정림이네", "음식점", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("왕뼈사랑", "음식점", 90, 90, 90, 34);
		Salon s1 = new Salon("박승철", "미용실", 100, 100, 67.99);
		Salon s2 = new Salon("이가자", "미용실", 100, 100, 70.99);
		Salon s3 = new Salon("리안", "미용실", 87, 87, 87);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

	public ArrayList<Store> getList() {
		// 가게 리스트를 가져오는 기능
		return null;
	}

	public ArrayList<Store> getStore(String searchStore) {
		// 상세정보기능
		return null;
	}

}
