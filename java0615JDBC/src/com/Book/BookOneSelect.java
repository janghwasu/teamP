package com.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookOneSelect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 금액 입력 : ");
		String money = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from BookInfo where price = ? ";

			pst = conn.prepareStatement(sql);

			pst.setString(1, money);

			ResultSet rs = pst.executeQuery();
			// insert, update, delete, create : executeUpdate 사용
			// return : 명령에 성공한 횟수

			// select : execureQuery 사용
			// return : 검색된 데이터를 리턴

			while (rs.next()) { // rs.next()가 데이터가 있을때 True 반환
				String num = rs.getString(1);
				String title = rs.getString(2);
				String price = rs.getString(3);
				String author = rs.getString(4);
				String company = rs.getString(5);

				System.out.println(" 번호 : " + num + "\n 제목 : " + title + "\n 가격 : " + price + "\n 저자 : " + author
						+ "\n 출판사 : " + company + "\n =================");

			}

		} catch (Exception e) {

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
