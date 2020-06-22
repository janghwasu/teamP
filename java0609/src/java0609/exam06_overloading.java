package java0609;

public class exam06_overloading {

	public static void main(String[] args) {

		// 매개 변수의 갯수나 타입이 다를 때 사용 가능
		// 오버로딩 == 중복정의

		int result = add('+', 1);
		System.out.println(result);

	}

	public static int add(float i, float j) {
		return (int) (i + j);

	}

	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	public static int add(int i, int j, int z) {
		return i + j + z;
	}

	public static int add(char op, int i) {
		if (op == '+') {
			return i + 1;
		} else {
			return 0;
		}

	}
}
