package tourism;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayData {
	
	/**
	 * display the home menu
	 */
	static void menu() {
		
		
		MySQLAccess conn = new MySQLAccess();
		ResultSet res;
		res = conn.getAllTableName();
		
		int count = 1;
		try {
			while (res.next()) {
				System.out.println(count++ + " - " + res.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
	/**
	 * dislay the table passed in argument
	 * 
	 * @param name
	 */
	static void table(String name) {
		MySQLAccess conn = new MySQLAccess();
		ResultSet res;
		res = conn.getAllDataFromTable(name);

		ResultSetMetaData resultMeta;
		try {
			resultMeta = res.getMetaData();
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
				// always 20 place for display
				String nameColumn = resultMeta.getColumnName(i).toUpperCase();
				String line =  centerString(nameColumn);
				
				System.out.print(line + "*");
			}
			
			System.out.println("\n" + DisplayData.getCharacter(resultMeta.getColumnCount() * 21,  "*"));

			while (res.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					// cut the data if to long
					String data = res.getObject(i).toString();
					
					System.out.print(centerString(data) + "|");
				}
					

				System.out.println("\n" + DisplayData.getCharacter(resultMeta.getColumnCount() * 21,  "-"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static String getCharacter(int number, String car) {
		String line = "";
		for (int i = 0; i < number; i++)
			line += car;
		
		return line;
	}

	
	private static String centerString (String str) {
		String strCenter = "";
		if (str.length() > 15) {
			str = str.substring(0, 15) + ".";
		}
		
		// Calculate space before and after
		int nbSpaces = 20 - str.length();
		if (nbSpaces%2 != 0) {
			strCenter += DisplayData.getCharacter((nbSpaces - 1) / 2, " ") + str + DisplayData.getCharacter((nbSpaces +1 ) / 2, " ");
		} else {
			strCenter += DisplayData.getCharacter(nbSpaces / 2, " ") + str + DisplayData.getCharacter(nbSpaces / 2, " ");
		}
		
		return strCenter;
	}
}
