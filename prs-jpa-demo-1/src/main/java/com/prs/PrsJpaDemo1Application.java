package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemo1Application.class, args);
		
		System.out.println("Hello SpringBoot World!");
		int o = 0;
		while (o!=9) {
			o = Console.getInt("Enter Option:  ", 0, 10);
			if (o==1) {
				// get all users
				List<User> users = UserDB.getAll();
				for (User u: users) {
					System.out.println(u);
				}
			}
			
		}
		
	}
	
	private static void displayMenu() {
		System.out.println("Options:");
		System.out.println("1 - list all users");
		System.out.println("9 - exit");
	}

}

