package festival;

public class fes0609_4 {

	public static void main(String[] args) {
		// ���￡�� �輭�� ã��

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(findkim(names));
	}

	public static String findkim(String[] names) {
		String name = "";

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				name = "�輭���� " + (i + 1) + "�� �ִ�.";
			}

		}
		return name;
	}
}
