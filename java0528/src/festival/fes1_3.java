package festival;

import java.util.Scanner;

public class fes1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵ �Է� >> ");
		int num = sc.nextInt();
		
		if  (num % 4 == 0 && num % 100 !=0 || num % 400 == 0) {
		
			System.out.println("����");
		} else {
			System.out.println("����ƴ�");
		}
	}

}
