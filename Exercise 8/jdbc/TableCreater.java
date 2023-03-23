package jdbc;

import java.sql.*;

class TableCreationExecuter {
	Connection con;
	Statement stmt;
	ResultSet rs;

	TableCreationExecuter() {
		try {
			Connection con = JDBCUtility.getConnection();
			stmt = con.createStatement();
			int createTableResult = stmt.executeUpdate("create table Employee(empNo integer,eName varchar(20),deptNo integer)");
			JDBCUtility.closeConnection(null, null);
		} catch (Exception exception) {
			JDBCUtility.closeConnection(exception, null);
			System.out.println(exception);
		}
	}
}

public class TableCreater {
	public static void main(String args[]) {
		new TableCreationExecuter();
	}
}
