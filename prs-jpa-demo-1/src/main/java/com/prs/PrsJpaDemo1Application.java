package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.ProductDB;
import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.business.Vendor;
import com.prs.business.VendorDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemo1Application.class, args);
		
		System.out.println("Hello SpringBoot World!");
		int o = 0;
		while (o!=9) {
			displayMenu();
			o = Console.getInt("Enter Option:  ", 0, 10);
			if (o==1) {
				// get all users
				List<User> users = UserDB.getAll();
				for (User u: users) {
					System.out.println(u);
				}
			}
			else if (o==2) {
				// delete a user
				int uid = Console.getInt("Enter user id to delete:  ");
				User u = UserDB.getUserById(uid);
				if (u==null) {
					System.out.println("No user found for id: "+uid);
				}
				else {
					if (UserDB.delete(u)) {
						// success
						System.out.println("User successfully deleted.");
					}
					else {
						System.out.println("Error deleting user.");
					}
				}
				
			}
			else if (o==3) {
				// get all vendors
				List<Vendor> vendors = VendorDB.getAll();
				for (Vendor v: vendors) {
					System.out.println(v);
				}
			}
			else if (o==4) {
				// get all products
				List<Product> products = ProductDB.getAll();
				for (Product p: products) {
					System.out.println(p);
				}
			}
			
		}
		
	}
	
	private static void displayMenu() {
		System.out.println("Options:");
		System.out.println("1 - list all users");
		System.out.println("2 - delete a user");
		System.out.println("3 - list all vendors");
		System.out.println("4 - list all products");
		System.out.println("9 - exit");
	}

}

