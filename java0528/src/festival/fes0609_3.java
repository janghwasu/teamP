package festival;

public class fes0609_3 {

	public static void main(String[] args) {
		// 문자열을 입력받아 알파벳순서대로 정렬하여 반환하는
		// 메소드를 구현하시오.
		// 단, 대소문자는 구분한다.
		System.out.println(reverseStr("ZAbcdVefEgAh"));
		System.out.println(reverseStr2("ZAbcdVefEgAh"));

	}

	private static String reverseStr2(String message) {
		char[] arr = message.toCharArray();
		// 기준 = 0, 기준 1, 기준2.... 기준9

		for (int j = 0; j < arr.length - 1; j++) {

			int minIndex = j;
			for (int i = j + 1; i < arr.length; i++) {

				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}

			}
			char temp = arr[minIndex];
			arr[minIndex] = arr[j];
			arr[j] = temp;

		}
		message = "";
		for (int i = 0; i < arr.length; i++) {
			message += arr[i];
		}

		return message;
	}

	private static String reverseStr(String message) {

		char[] arr = new char[message.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = message.charAt(i);
		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		message = "";
		for (int i = 0; i < arr.length; i++) {
			message += arr[i];
		}
		return message;
	}
}