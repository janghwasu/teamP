import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();

		for (int i = 2; i <= num;) {
			if (num % i == 0) {
				System.out.print(i);
				num = num / i;
				if (num == 1)
					break;

				else
					System.out.print("*");
			} else {
				i++;
			}
		}
	}
}
