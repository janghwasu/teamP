package com.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BookInsert {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� �Է��ϼ���");
		String num = sc.next();
		System.out.print("������ �Է��ϼ���");
		String title = sc.next();
		System.out.print("������ �Է��ϼ���");
		String price = sc.next();
		System.out.print("���ڸ� �Է��ϼ���");
		String author = sc.next();
		System.out.print("���ǻ縦 �Է��ϼ���");
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
				System.out.println("�Է¼���");
			} else {
				System.out.println("�������");
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
//				System.out.println(cnt + "�� ��ɼ���");
//
//			} else {
//				System.out.println("��ɽ���");
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
