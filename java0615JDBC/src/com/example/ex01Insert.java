package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex01Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID �Է� : ");
		String id = sc.next();
		System.out.print("PW �Է� : ");
		String pw = sc.next();
		System.out.print("NICK �Է� : ");
		String nick = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		// 1. Oracle���� �����ϴ� lib������ import
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. �����ε�(Java�� �����ڰ� � DBMS�� ������� ��)

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw); // �ּ�, id, pw
			// 3. DB�� ���� ���� DB ID�� DB PW�� �����޴� ����
			// ���������� ������ �޾����� DB�� �ڵ鸵 �� �� �ִ�
			// Connection ��ü�� return

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}

			String sql = "insert into member values(?,?,?)";

			pst = conn.prepareStatement(sql);
			// 4. SQL���� �غ��ϴ� �ܰ�
			// SQL���� �̻��� ���� �� PreparedStatement ����
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, nick);

			int cnt = pst.executeUpdate();
			// 5. SQL���� ���� / ��� �� ó�� �ܰ�

			if (cnt > 0) {
				System.out.println(cnt + "�� ��ɼ���");

			} else {
				System.out.println("��ɽ���");
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
