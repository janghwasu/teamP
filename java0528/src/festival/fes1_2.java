package festival;
import java.util.Scanner;
public class fes1_2 {

	public static void main(String[] args) {
		int money;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재금액: ");
		money = sc.nextInt();
		
		System.out.println("잔돈 반환");
		
		System.out.println("10000원 : "+money/10000+"개");
		money = money - money/10000*10000;
		System.out.println("5000원 : "+money/5000+"개");
		money = money - money/5000*5000;
		System.out.println("1000원 : "+money/1000+"개");
		money = money - money/1000*1000;
		System.out.println("500원 : " +money/500+"개");
		money = money - money/500*500;
		System.out.println("100원 : " +money/100+"개");
		money = money - money/100*100;
		

	}

}
