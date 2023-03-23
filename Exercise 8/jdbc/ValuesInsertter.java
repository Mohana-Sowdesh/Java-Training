package jdbc;

import java.sql.*;

class ValuesInsertionExecuter {
	Connection con;
	Statement stmt;
	ResultSet rs;

	ValuesInsertionExecuter() {
		try {
			Connection con = JDBCUtility.getConnection();
			stmt = con.createStatement();
			int insertResult1 = stmt.executeUpdate("insert into Employee values(1035,'Boreish',56)");
			int insertResult2 = stmt.executeUpdate("insert into Employee values(2014,'Sathiya',31)");
			int insertResult3 = stmt.executeUpdate("insert into Employee values(3065,'Santhosh',92)");
			
			con.setAutoCommit(false);
			rs = stmt.executeQuery("select * from Employee");
			System.out.println("EMPLOYEE NO.  EMPLOYEE NAME  DEPT NO.");
			System.out.println("-------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " 		" + rs.getString(2) + " 	" + rs.getInt(3));
			}
			con.setAutoCommit(true);
		} 
		catch (Exception exception) {
			System.out.println(exception);
		}
	}
}

class ValuesInsertter {
	public static void main(String args[]) {
		new ValuesInsertionExecuter();
	}
}
