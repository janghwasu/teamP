package festival;

public class fes0609_3 {

	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾� ���ĺ�������� �����Ͽ� ��ȯ�ϴ�
		// �޼ҵ带 �����Ͻÿ�.
		// ��, ��ҹ��ڴ� �����Ѵ�.
		System.out.println(reverseStr("ZAbcdVefEgAh"));
		System.out.println(reverseStr2("ZAbcdVefEgAh"));

	}

	private static String reverseStr2(String message) {
		char[] arr = message.toCharArray();
		// ���� = 0, ���� 1, ����2.... ����9

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