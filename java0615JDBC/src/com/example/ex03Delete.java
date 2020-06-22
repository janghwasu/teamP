package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ID �Է� ");
		String id = sc.next();

		// ����ڰ� �Է��� ID�� �����Ͻÿ�

		Connection conn = null;
		PreparedStatement pst = null;
		
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

			String sql = "delete member where id = ?";

			pst = conn.prepareStatement(sql);
			// 4. SQL���� �غ��ϴ� �ܰ�
			// SQL���� �̻��� ���� �� PreparedStatement ����

			pst.setString(1, id);

			int cnt = pst.executeUpdate();
			// 5. SQL���� ���� / ��� �� ó�� �ܰ�

			if (cnt > 0) {
				System.out.println(cnt + "�� ��ɼ���");

			} else {
				System.out.println("��ɽ���");
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
