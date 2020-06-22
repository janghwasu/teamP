package com.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookOneSelect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �ݾ� �Է� : ");
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
			// insert, update, delete, create : executeUpdate ���
			// return : ��ɿ� ������ Ƚ��

			// select : execureQuery ���
			// return : �˻��� �����͸� ����

			while (rs.next()) { // rs.next()�� �����Ͱ� ������ True ��ȯ
				String num = rs.getString(1);
				String title = rs.getString(2);
				String price = rs.getString(3);
				String author = rs.getString(4);
				String company = rs.getString(5);

				System.out.println(" ��ȣ : " + num + "\n ���� : " + title + "\n ���� : " + price + "\n ���� : " + author
						+ "\n ���ǻ� : " + company + "\n =================");

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
