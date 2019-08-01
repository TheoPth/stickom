package tourism;

import java.util.Scanner;

public class Main {
	static MySQLAccess mysql;
	static Scanner sc;

	public static void main(String[] args) {
		mysql = new MySQLAccess();
		sc = new Scanner(System.in);
		while (true) {
			String tableChoose = askMenu();
			String actionChoose = askAction();
			
			doActionOnTable(tableChoose, actionChoose);
			System.out.println("Press any key to go to menu.");
			sc.nextLine();
		}
	}

	private static void doActionOnTable(String tableChoose, String actionChoose) {
		if (actionChoose.equals("new")) {
			mysql.addNewRecordFromClass(tableChoose);
			System.out.println("Succesfully added !");
		} else if (actionChoose.equals("delete")) {
			mysql.deleteRecord(tableChoose);
			System.out.println("Succesfully deleted !");
		} else if (actionChoose.equals("show")) {
			DisplayData.table(tableChoose);
		}
		
	}

	public static String askMenu() {
		Boolean ok = false;
		String tableChoose = "";

		while (!ok) {

			System.out.println("Please choose a table.");
			DisplayData.menu();
			tableChoose = sc.nextLine();

			if (!mysql.checkTableExist(tableChoose)) {
				System.out.println("This table does not exist.");
			} else {
				ok = true;
			}
		}

		return tableChoose;
	}

	public static String askAction() {
		Boolean ok = false;
		String actionChoose = "";
		
		while (!ok){
			System.out.println("Wich action ?");
			System.out.println("1 - New");
			System.out.println("2 - Delete");
			System.out.println("3 - Show");
			actionChoose = sc.nextLine();
			if (actionChoose.toLowerCase().equals("new")) {
				ok = true;
				return "new";
			}
			else if (actionChoose.toLowerCase().equals("delete")) {
				ok = true;
				return "delete";
			}
			else if (actionChoose.toLowerCase().equals("show")) {
				ok = true;
				return "show";
			}
			else {
				System.out.println("This action does not exist.");
			}
		}
		
		return "";
	}
}
