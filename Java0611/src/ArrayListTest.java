import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();

		// 데이터 추가 (add를 활용)
		list.add("사과");
		list.add("포도");

		// 데이터 가져오기(get을 활용)
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// 원하는 위치에 데이터 추가
		list.add(1, "배");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 요소 삭제
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// 요소 전체 삭제
		list.clear();
		
		// 요소 개수 확인
		System.out.println(list.size());
		
		
	}

}
