package exam01;

public class 변수_치환1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a,b = 1,2
		// a = 3
		// b = 4
		// a,b = b,a
		
		int a = 3, b = 4;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a+","+b);
		
		//형변환 - 자동형변환
		System.out.println(a+','+b); //',' 를 숫자로 연산하기 때문에 결과값이 44로 인식

		char c2 = 44;
		System.out.println(c2);
		
		//형변환 
		//자동형변환 작은값 -> 큰값
		//강제형변환 큰값 -> 작은값
		
		//형변환 - 강제형변환
		char c3 = (char)(a+','+b); //강제형변환으로 (char)넣어줌
		System.out.println(c3);
		
		int i2 = 10000000;
		short c4 = (short)i2;
		System.out.println(c4);  //강제형변환 큰값->작은값일때 데이터 손실이 일어남
	}

}
