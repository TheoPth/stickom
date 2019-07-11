package tourism;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class MySQLAccess {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	final private String bdName = "tourismManagement";
	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "mysqlvitech";

	/**
	 * Connect to the database
	 * 
	 * @return able to execute statement in the database
	 */
	private Connection getConnection() {
		if (connect == null) {
			try {
				return DriverManager.getConnection(
						"jdbc:mysql://" + host + "/tourismManagement?" + "user=" + user + "&password=" + passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			return this.connect;
		}

		return null;
	}

	/**
	 * 
	 * @return all table name of the database
	 * @throws Exception
	 */
	public ResultSet getAllTableName() {
		Connection connect = this.getConnection();
		try {
			statement = connect.createStatement();
			resultSet = statement.executeQuery(
					"SELECT table_name FROM information_schema.tables WHERE table_schema ='" + bdName + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultSet;
	}

	public ResultSet getAllDataFromTable(String name) {
		Connection connect = this.getConnection();
		try {
			statement = connect.createStatement();
			resultSet = statement.executeQuery("SELECT * from " + name);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultSet;
	}

	public boolean checkTableExist(String tableName) {
		ResultSet tables = this.getAllTableName();

		try {
			while (tables.next()) {
				if (tables.getString(1).toLowerCase().equals(tableName))
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	
	public void addNewRecordFromTable(String tableName) {
		ResultSet res;
		res = getAllDataFromTable(tableName);
		Scanner sc = new Scanner(System.in);
		ResultSetMetaData resultMeta;
		ArrayList<String> attrs = new ArrayList<String>();
		try {
			resultMeta = res.getMetaData();
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
				// alway 20 place for display
				String nameColumn = resultMeta.getColumnName(i).toUpperCase();
				
				System.out.println("Choose " + nameColumn);
				
				attrs.add(sc.nextLine());
			}
			addNewRecord(tableName, attrs);
		} catch (Exception e) {
			
		}
	}
	
	private void addNewRecord(String tableName, ArrayList<String> attrs) {
		Connection connect = this.getConnection();
		String query = "insert into " + tableName + " values(";
		ResultSetMetaData resultMeta;
		try {
			Statement stat = connect.createStatement();
			
			for (String attr : attrs) {
				if (Utils.isNumeric(attr) || attr.equals("null")) {
					query += attr;
				} else {
					query += "'" + attr + "'";
				}
				query += ", ";
			}
			
			query = query.substring(0, query.length() - 2 );
			query += ");";
			
			stat.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Close a connection
	 */
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	public void deleteRecord(String tableChoose) {
		System.out.println("Which record do you want to delete ? Enter ID please.");
		DisplayData.table(tableChoose);
		
		Scanner sc = new Scanner(System.in);
		int numRow = sc.nextInt();
		try {
			Statement stat = this.getConnection().createStatement();
			stat.executeUpdate("delete from " + tableChoose + " where id = " + numRow);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}