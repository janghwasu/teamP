import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// ��Ʈ�ѷ� ���
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
			// try catch�ؼ� �Ǵµ� ���������� catch(SQLexception)
			String sql = "insert into members values(?,?,?,?)";
			// id�� pw�� ��ġ�ϴ� ������ select\
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId()); // ?�ϳ��� 1�� ����, ù��° ���� ID
			psmt.setString(2, vo.getPw()); // �ι�° pw
			psmt.setInt(3, vo.getAge()); // �ι�° pw
			psmt.setString(4, vo.getName()); // �ι�° pw

			cnt = psmt.executeUpdate();// ����� update�� �Է�, query�� �˻�
			// ResultSet�� ���� ������ ǥ�� ��ȯ, ������ ��ǥ�� ��ȯ
			// ResultSet�� Ŀ�� ����, Ŀ���� �� ó�� �÷��� ����Ŵ
			// ���� ResultSet�� Ŀ�� ��ĭ ���� �� ������(���� �ִٸ�, �α��� �����ߴٸ�)

			// rs�� boolean������ �̵��� �� ������ True, �̵� �Ұ��� False

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
			psmt = conn.prepareStatement(sql); // 1. Ŀ�ؼ��� ���ؼ� �޾ƿ�. 2. sql ������ �ǳ���.

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery(); // ����� update�� �Է�, query�� �˻�
			if (rs.next()) {
				name = rs.getString("name");
//				String login_id = rs.getString(1); // �ε��� ��ȣ ���� ���(ù��°)
//				String login_name = rs.getString("name"); // �ε��� ��ȣ�� �𸦶� �÷��� �̸����� ���(�ι�°)
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
			psmt = conn.prepareStatement(sql); // sql ���� ����
			rs = psmt.executeQuery();

			while (rs.next()) { // rs�� �ִ� ��� ������ ��������, while ������
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
			psmt.setString(2, pw); // sql �غ� ��
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
