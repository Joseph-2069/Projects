package jdbcNormalImplementation;
import java.sql.*;

public class JDBC_CreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Pass@1234");
				Statement st = con.createStatement();

		) {
			String sql = "CREATE TABLE Studentsssss" + "(id INTEGER not NULL," + " Name VARCHAR(255),"
					+ "PRIMARY KEY(id))";
			st.executeUpdate(sql);

			System.out.println("Table executed sucessfullyyy");

			con.close();
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
