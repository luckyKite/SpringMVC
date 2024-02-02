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

}
