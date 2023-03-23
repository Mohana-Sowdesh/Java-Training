package jdbcExercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;

public class JDBCUtility {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

	public static Connection getConnection() {
		Connection con = threadLocal.get();
		if (con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/jdbcExercise", "root", "$owdeSh14");
				con.setAutoCommit(false);
				threadLocal.set(con);
			} catch (Exception exception) {
				exception.printStackTrace();
				return null;
			}
		}
		return con;
	}

	public static void closeConnection(Exception exception, Savepoint savePoint) {
		Connection con = threadLocal.get();
		if (con != null) {
			try {
				if (exception != null) {
					if (savePoint == null) {
						System.out.println(exception);
						con.rollback();
					} else {
						con.rollback(savePoint);
						con.commit();
					}

				} else {
					con.commit();
				}
				con.close();
				threadLocal.remove();
			} catch (Exception exceptionMsg) {
				exceptionMsg.printStackTrace();
			}
		}
	}
}
