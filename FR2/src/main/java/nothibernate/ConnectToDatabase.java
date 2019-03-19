package nothibernate;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectToDatabase {

	public static void run() throws SQLException {
		// Connect to the database.
		Connection con = connect();
		Query(con);
		con.close();
	}
	public static Connection connect() throws SQLException {
		try {
			Class.forName("con.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Logger.
		}
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "root");

		return con;
	}

	public static void Query(Connection con) throws SQLException {
		Statement stmt = (Statement) con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM generic");

		while (rs.next()) {
			int columnCount = rs.getMetaData().getColumnCount();

			for (int i = 1; i <= columnCount; i++) {
				System.out.println("Column " + i + ": " + rs.getObject(i));
			}
		}
		rs.close();
		stmt.close();
	}
}
