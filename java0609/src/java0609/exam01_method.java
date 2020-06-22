package java0609;

public class exam01_method {

	public static void main(String[] args) {

		System.out.println(num(5, 4));
		print(4);
		printName();

	}

	public static int num(int i, int j) {
		return i + 1 + j;

	}

	// void 는 return type 이 없어도 된다.
	public static void print(int i) {
		System.out.println("제가 좋아하는 숫자는  " + i + "입니다.");
		System.out.println("hi");

		// 매개변수가 없는 method

	}

	public static void printName() {
		System.out.println("제 이름은 장화수입니다.");

	}

}
