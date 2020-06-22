package array;

public class exam01 {

	public static void main(String[] args) {
		// 배열(Array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 파이썬과의 차이는 동일한 타입이라는 것이 차이점

		// 배열의 선언
		int[] intArray; // 선언할때 공간 할당시키면 안됨

		// 배열의 생성

		intArray = new int[5]; // new 키워드가 배열을 생성시고 공간을 할당 시킬 수 있음

		// 배열 주소 출령
		System.out.println(intArray);

		int[] temp = intArray;

		temp[1] = 15;
		System.out.println(temp[1]);
		System.out.println(intArray[1]);
		int num1 = 10;
		int mun2 = num1;


		
		System.out.println(intArray.length);
		
	}

}
