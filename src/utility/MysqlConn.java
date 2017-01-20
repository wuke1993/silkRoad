package utility;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author: wuke 
 * @date  : 2016年11月25日 下午8:53:20
 * Title  : MySqlConn
 * Description : 
 */
public class MysqlConn {
	public static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/silkroadresources";
		String username = "root";
		String password = "1234";
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connect to mysql database silkroadresources!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
