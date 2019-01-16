package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.db.DBUtil;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("JPA Demo - using PRS DB");
		
		String command = "";
		while(!command.equals("9")) {
			displayMenu();
			command = Console.getString("Enter command: ");
			if (command.equals("1")) {
				// list all users
				List<User> users = UserDB.getAll();
				System.out.println("List of all users:");
				for (User user: users) {
					System.out.println(user);
				}
			}
			else if (command.equals("2")) {
				// get user by id
				int uid = Console.getInt("Enter user id: ");
				User u = UserDB.getUserById(uid);
				System.out.println("user retrieved = "+u);
			}
			else if (!command.equals("9")) {
				System.out.println("Invalid command.  Please try again.");
			}
			System.out.println();
		}
		
		DBUtil.closeEMF();
		System.out.println("Bye");
	}
	
	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("Menu:\n");
		sb.append("1 - list all users\n");
		sb.append("2 - get user by id\n");
//		sb.append("3 - list all vendors\n");
//		sb.append("4 - get vendor by id\n");
		sb.append("9 - exit\n");
		System.out.println(sb);
	}
}

