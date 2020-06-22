package com.example;

public class ex00trycatch {

	public static void main(String[] args) {
		/* 
	Java 파일 실행되는 과정
	.java -> 컴파일 -> .class -> 실행
		
	컴파일오류 : 문법적오류	
	런타임오류 : 실행이 되야 알 수 있는 오류 
			(파일 찾을 때(열기) / DB / 네트워크 등)
			try ~ catch(예외처리) 교재 p.152
		
		
*/
		System.out.println("실행시작");
		
		try { // 프로그램 실행
			
			System.out.println(2/0);
			
		}catch (Exception e) {
			// 오류가 났을 떄
			System.out.println("오류발생!");
			e.printStackTrace();
		}finally {
			// try~catch 마지막에 무조건 실행되는 명령
			System.out.println("try~catch종료");
		}
		System.out.println("실행완료");
		
	}

}
