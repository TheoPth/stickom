package tourism;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class MySQLAccess {

	private Connection connect = null;
	private Statement statement = null;
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
			e.printStackTrace();
		}

		return resultSet;
	}
	
	/**
	 * Retrieve all record of a table of the database
	 * @param name
	 * @return ResultSet of record
	 */
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
	
	/**
	 * Ask the database to know if a table exist
	 * @param tableName
	 * @return 
	 */
	public boolean checkTableExist(String tableName) {
		ResultSet tables = this.getAllTableName();

		try {
			while (tables.next()) {
				if (tables.getString(1).toLowerCase().equals(tableName.toLowerCase()))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	/**
	 * Save the Object in a bd mysql
	 * @param obj
	 */
	public void saveNewEntitie(Object obj) {
		Connection connect = this.getConnection();
		
		String query = "insert into " + obj.getClass().getSimpleName().toLowerCase() + " values(";
		
		Field[] fields = obj.getClass().getDeclaredFields();
		try {
			Statement stat = connect.createStatement();
			
			for (Field field : fields) {
				field.setAccessible(true);
				
				if (field.getType().equals(Integer.class)) {
					query += field.get(obj);
				} else {
					query += "'" + field.get(obj) + "'";
				}
				query += ", ";
			}

			query = query.substring(0, query.length() - 2);
			query += ");";
			stat.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	/**
	 * Create and save recored 
	 * @param tableName record who want to be created
	 * @return
	 */
	public Object addNewRecordFromClass(String tableName) {
		Object newEntitie = null;
		try {
			newEntitie = Utils.instanceByClassName(tableName);
			ArrayList<Method> methods = getAllSettersFromClass(tableName);
			
			for (Method m : methods) {
				System.out.println("Choose " + presentSetter(m.getName()));
				Utils.askField(m, newEntitie);
			}
			saveNewEntitie(newEntitie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newEntitie;
	}
	
	/**
	 * Take of the prefix set of the setter name
	 * @param setter
	 * @return
	 */
	private static String presentSetter(String setter) {
		return setter.substring(3).toUpperCase();
	}
	
	
	
	/**
	 * 
	 * @param tableName
	 * @return all the setters of the given class
	 */
	static public ArrayList<Method> getAllSettersFromClass(String tableName) {
		// Class always has a uppercase at the beginning
		ArrayList<Method> setters = new ArrayList<>();
		
		try {
			Object obj = Utils.instanceByClassName(tableName);
			Method[] methods = obj.getClass().getMethods();
			
			for (Method m : methods) {
				if (Utils.isSetter(m)) {
					setters.add(m);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return setters;

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
			sc.close();
			addNewRecord(tableName, attrs);
		} catch (Exception e) {

		}
	}

	private void addNewRecord(String tableName, ArrayList<String> attrs) {
		Connection connect = this.getConnection();
		String query = "insert into " + tableName + " values(";
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

			query = query.substring(0, query.length() - 2);
			query += ");";

			stat.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Delete a selected record from an asked id
	 * @param tableChoose
	 */
	public void deleteRecord(String tableChoose) {
		System.out.println("Which record do you want to delete ? Enter ID please.");
		DisplayData.table(tableChoose);

		Scanner sc = new Scanner(System.in);
		int numRow = sc.nextInt();
		try {
			Statement stat = this.getConnection().createStatement();
			stat.executeUpdate("delete from " + tableChoose + " where id = " + numRow);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}