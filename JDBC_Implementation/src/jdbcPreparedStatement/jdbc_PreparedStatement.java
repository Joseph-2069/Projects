package jdbcPreparedStatement;

import java.sql.*;

public class jdbc_PreparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataBasePrac", "root",
				"Pass@1234");) {

//		String sql= "INSERT INTO Employee(EmpId, EmpName) VALUES(?,?)";

//		PreparedStatement ps = con.prepareStatement(sql);
			PreparedStatement pr = con.prepareStatement("INSERT INTO Employee(EmpId, EmpName) VALUES(?,?)");
			pr.setInt(1,71);
			pr.setString(2, "Rma");
			pr.executeUpdate();

			ResultSet rs = pr.executeQuery("Select * from Employee");
			System.out.println("Execution done!!!!");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + ":  ");
				System.out.println(rs.getString(2));

			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
