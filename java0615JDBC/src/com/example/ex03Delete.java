package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 ID 입력 ");
		String id = sc.next();

		// 사용자가 입력한 ID를 삭제하시오

		Connection conn = null;
		PreparedStatement pst = null;
		
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

			String sql = "delete member where id = ?";

			pst = conn.prepareStatement(sql);
			// 4. SQL문을 준비하는 단계
			// SQL문에 이상이 없을 때 PreparedStatement 리턴

			pst.setString(1, id);

			int cnt = pst.executeUpdate();
			// 5. SQL문을 실행 / 명령 후 처리 단계

			if (cnt > 0) {
				System.out.println(cnt + "개 명령성공");

			} else {
				System.out.println("명령실패");
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
