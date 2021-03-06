package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex01Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("NICK 입력 : ");
		String nick = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		// 1. Oracle에서 제공하는 lib파일을 import
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 동적로딩(Java는 개발자가 어떤 DBMS를 사용할지 모름)

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw); // 주소, id, pw
			// 3. DB로 가서 실제 DB ID와 DB PW를 인증받는 절차
			// 성공적으로 인증을 받았으면 DB를 핸들링 할 수 있는
			// Connection 객체를 return

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "insert into member values(?,?,?)";

			pst = conn.prepareStatement(sql);
			// 4. SQL문을 준비하는 단계
			// SQL문에 이상이 없을 때 PreparedStatement 리턴
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, nick);

			int cnt = pst.executeUpdate();
			// 5. SQL문을 실행 / 명령 후 처리 단계

			if (cnt > 0) {
				System.out.println(cnt + "개 명령성공");

			} else {
				System.out.println("명령실패");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				pst.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
