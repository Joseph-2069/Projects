package jdbcNormalImplementation;
import java.io.FileNotFoundException;
import java.sql.*;

public class JDBC_InsertTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataBasePrac", "root",
				"Pass@1234"); 
				
				Statement st = con.createStatement();
		) {
//			String sql = "CREATE TABLE Employee ( EmpId Integer,EmpName VARCHAR(255), PRIMARY KEY (EmpId))";
//			st.executeUpdate(sql);
			st.executeUpdate("INSERT INTO Employee Values('2','George');");
			ResultSet rs= st.executeQuery("Select * from Employee");
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + ":  ");
				System.out.println(rs.getString(2));

			}

//			System.out.println("Chal gaya bhai!!!!");
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
