package kr.bit.model;

//JDBC -> mybatis, JPA
import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//데이터베이스 연결객체 생성(Connection)
	public void getConnect() {
		String URL="jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
		String user="root";
		String password="";
		
		//MySQL Driver Loading
		try {
			//동적로딩
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL, user, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//회원저장 동작
	public int memberInsert(MemberVO vo) {
		//																 ?(파라메터) 1, 2, 3, 4, 5, 6
		String SQL = "insert into member(id, pass, name, age, email, phone) values(?, ?, ?, ?, ?, ?)";
		getConnect();
		
		//SQL 문장을 전송하는 객체 생성
		int cnt = -1;
		try {
			ps=conn.prepareStatement(SQL); //미리 컴파일을 시킨다 (속도가 빠르게)
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPass());
			ps.setString(3, vo.getName());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getEmail());
			ps.setString(6, vo.getPhone());
			
			ps.executeUpdate(); //전송(실행)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt; //1 or 0
	}

}
