package eaxm02;

public class 연산자 {

	public static void main(String[] args) {
		// 산술연산자 :  +, -, *, 
		// 몫 연산자 : / 
		// 나머지 연산자 : % 
		
		int a = 10, b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		System.out.println(a%(double)b);
		
		// 다른 데이터 타입의 두 변수를 연산하면 일반적으로 작은 크기의 변수가 큰 크기의 데입아려 자동형변환
		// 일반적으로 작은 크기의 변수가 큰 크기
	}

}
