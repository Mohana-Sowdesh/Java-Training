package jdbcExercise2;

import java.sql.*;

public class PreparedStatementExecuter {
	public static void main(String args[]) {
		
		Connection con= JDBCUtility.getConnection();
		Statement stmt;

		PreparedStatement updateSales;
		PreparedStatement updateTotal;

		String updateString = "update COFFEES " + "set SALES = ? where COF_NAME like ?";
		String updateStatement = "update COFFEES " + "set TOTAL = TOTAL + ? where COF_NAME like ?";
		String query = "select COF_NAME, SALES, TOTAL from COFFEES";

		try {
			updateSales = con.prepareStatement(updateString);
			updateTotal = con.prepareStatement(updateStatement);
			int[] salesForWeek = { 175, 150, 60, 155, 90 };
			String[] coffees = { "Colombian", "French_Roast", "Espresso", "Colombian_Decaf", "French_Roast_Decaf" };
			int len = coffees.length;
			con.setAutoCommit(false);
			for (int i = 0; i < len; i++) {
				updateSales.setInt(1, salesForWeek[i]);
				updateSales.setString(2, coffees[i]);
				updateSales.executeUpdate();
				
				updateTotal.setInt(1, salesForWeek[i]);
				updateTotal.setString(2, coffees[i]);
				updateTotal.executeUpdate();
				con.commit();
			}
			
			updateSales.close();
			updateTotal.close();
			
			System.out.println("COF_NAME 		SALES  		TOTAL");
			System.out.println("------------------------------------------------");
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String c = rs.getString("COF_NAME");
				int s = rs.getInt("SALES");
				int t = rs.getInt("TOTAL");
				System.out.println(c + " 	  	" + s + " 	" + t);
			}
			stmt.close();
			JDBCUtility.closeConnection(null, null);
		} 
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			if (con != null) {
				try {
					System.err.print("Transaction is being rolled back");
					con.rollback();
				} catch (SQLException exception) {
					System.err.print("SQL Exception: ");
					System.err.println(exception.getMessage());
				}
			}
			JDBCUtility.closeConnection(ex, null);
		}
	}
}
