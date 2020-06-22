package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); // Classnotfoundexcepetion
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			conn = DriverManager.getConnection(url, dbid, dbpw); // SQLException
			String sql = "select * from member where id = ? and pw = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, "id1");
			pst.setString(2, "123");
			rs = pst.executeQuery(); // ResultSet은 커서형태

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);

				System.out.println(id + pw + nick);
			}

		} catch (ClassNotFoundException e) {
			// 예외처리를 받아준다
			e.printStackTrace();
			System.out.println("클래스를 못찾음");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SQL 에러");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pst != null) {
					pst.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
