package ui;

import java.sql.SQLException;
import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserDBApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App");
		Console console = new Console();
		int choice = 0;
		StuffyDB sdb = new StuffyDB();
		while (choice != 6) {
			displayMenu();
			choice = console.getInt("Enter option:  ",0,7);
			if (choice == 1) {
				// get a list of all stuffies
				try {
					List<Stuffy> stuffies = sdb.getAll();
					System.out.println("Stuffies List:");
					for (Stuffy s: stuffies) {
						System.out.println(s.toString());
					}
				} catch (SQLException e) {
					System.out.println("Exception occured getting all stuffies.");
					e.printStackTrace();
				}
			}
			else if (choice == 2) {
				// Grab a Stuffy
				try {
					// 1 - get list of all stuffies
					List<Stuffy> stuffies = sdb.getAll();
					// 2 - generate a random # from size of stuffy list
					int size = stuffies.size();
					int rand = (int) ((Math.random()*size)+1);
					// 3 - get that instance of stuffy from the list
					Stuffy s = stuffies.get(rand);
					// 4 - delete it
					if (sdb.delete(s)) {
						System.out.println("You got a "+s);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (choice == 3) {
				// add a Stuffy
				// Prompt user for type, color and size
				System.out.println("Add a new Stuffy:");
				String type = console.getString("Stuffy Type:  ");
				String color = console.getString("Stuffy Color:  ");
				String size = console.getString("Stuffy Size:  ");
				Stuffy s = new Stuffy(0,type, color, size);
				try {
					if (sdb.add(s))
						System.out.println("Stuffy successfully added.");
				} catch (SQLException e) {
					System.out.println("Error adding stuffy.");
					e.printStackTrace();
				}
			}
			else if (choice == 5) {
				// Get a stuffy, but don't remove
				System.out.println("Get a stuffy");
				int id = console.getInt("Enter stuffy id:  ");
				Stuffy s = null;
				try {
					s = sdb.get(id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (s!=null)
					System.out.println("You picked: "+s);
				else 
					System.out.println("No Stuffy w/ ID "+id+" found.");
			}
		}
		
		
		System.out.println("Goodbye");
	}

	private static void displayMenu() {
		System.out.println("Stuffy Dispenser Options:");
		System.out.println("1 - List all Stuffies");
		System.out.println("2 - Grab a Stuffy");
		System.out.println("3 - Add a Stuffy");
		System.out.println("4 - Update a Stuffy");
		System.out.println("5 - Get/Inspect a Stuffy");
		System.out.println("6 - Exit");
	}
}
