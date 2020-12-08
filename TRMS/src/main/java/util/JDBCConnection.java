package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	
private static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			if (conn == null) {
				
				String username = "Deonna";
				String password = "Tawney666";
				String endpoint = "usfbootcamp.ctttuwqtrxzv.us-east-2.rds.amazonaws.com";
				String url ="jdbc:oracle:thin:@"+endpoint+":1521:ORCL";
				conn = DriverManager.getConnection(url, username, password);
				return conn;
			}else {
				
				return conn;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		
		Connection conn1 = getConnection();
		Connection conn2 = getConnection();
		
		System.out.println(conn1);
		System.out.println(conn2);
		
	}


}