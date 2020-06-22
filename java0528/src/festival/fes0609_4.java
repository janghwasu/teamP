package festival;

public class fes0609_4 {

	public static void main(String[] args) {
		// 서울에서 김서방 찾기

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findkim(names));
	}

	public static String findkim(String[] names) {
		String name = "";

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				name = "김서방은 " + (i + 1) + "에 있다.";
			}

		}
		return name;
	}
}
