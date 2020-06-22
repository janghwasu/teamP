import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// 컨트롤러 기능
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int join(MemberVO vo) {
		int cnt = 0;
		getConnection();

		try {
			// try catch해서 되는데 복잡해지니 catch(SQLexception)
			String sql = "insert into members values(?,?,?,?)";
			// id와 pw를 일치하는 정보만 select\
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId()); // ?하나당 1씩 증가, 첫번째 부터 ID
			psmt.setString(2, vo.getPw()); // 두번째 pw
			psmt.setInt(3, vo.getAge()); // 두번째 pw
			psmt.setString(4, vo.getName()); // 두번째 pw

			cnt = psmt.executeUpdate();// 실행시 update는 입력, query는 검색
			// ResultSet은 값이 있으면 표로 반환, 없으면 빈표를 반환
			// ResultSet은 커서 개념, 커서는 맨 처음 컬럼을 가르킴
			// 만약 ResultSet이 커서 한칸 내릴 수 있으면(값이 있다면, 로그인 성공했다면)

			// rs는 boolean형으로 이동할 수 있으면 True, 이동 불가시 False

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

		}

		return cnt;
	}

	public String login(MemberVO vo) {
		String name = null;

		try {
			getConnection();

			String sql = "select * from members where ID = ? and PW = ?";
			psmt = conn.prepareStatement(sql); // 1. 커넥션을 통해서 받아옴. 2. sql 문장을 건네줌.

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery(); // 실행시 update는 입력, query는 검색
			if (rs.next()) {
				name = rs.getString("name");
//				String login_id = rs.getString(1); // 인덱스 번호 쓰는 방법(첫번째)
//				String login_name = rs.getString("name"); // 인덱스 번호를 모를때 컬럼의 이름쓰는 방법(두번째)
//				System.out.println(login_id);
//				System.out.println(login_name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return name;
	}

	public ArrayList<MemberVO> selectAll() {

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		getConnection();
		String sql = "select * from members";
		try {
			psmt = conn.prepareStatement(sql); // sql 문장 실행
			rs = psmt.executeQuery();

			while (rs.next()) { // rs에 있는 모든 데이터 가져오기, while 문으로
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				MemberVO vo = new MemberVO(id, name, age);
				list.add(vo);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}

	public int delete(String id, String pw) {

		try {
			getConnection();
			String sql = "delete from members where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw); // sql 준비 끝
			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				return cnt;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}
}
