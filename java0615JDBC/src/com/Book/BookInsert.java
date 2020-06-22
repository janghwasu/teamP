package com.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookInsert {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요");
		String num = sc.next();
		System.out.print("제목을 입력하세요");
		String title = sc.next();
		System.out.print("가격을 입력하세요");
		String price = sc.next();
		System.out.print("저자를 입력하세요");
		String author = sc.next();
		System.out.print("출판사를 입력하세요");
		String company = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("입력성공");
			} else {
				System.out.println("연결실패");
			}

			String sql = "insert into bookinfo values(?,?,?,?,?)";

			pst = conn.prepareStatement(sql);

			pst.setString(1, num);
			pst.setString(2, title);
			pst.setString(3, price);
			pst.setString(4, author);
			pst.setString(5, company);

			int cnt = pst.executeUpdate();

//			if (cnt > 0) {
//				System.out.println(cnt + "개 명령성공");
//
//			} else {
//				System.out.println("명령실패");
//			}

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
