package com.karenngomes.interfaces;

import java.util.Scanner;

import com.karenngomes.implementation.*;

public class Menu {
	
	static Scanner input = new Scanner(System.in);
	
	Data data = new Data();
	
	User user1 = new User("Karen", "Gomes", "kngs@ic.ufal.br", "karen123");
	User user2 = new User("Nich", "Araujo", "paz@ic.ufal.br", "nich123");
	
	
	
	public void mainMenu() {
		
		Data.users.add(user1);
		Data.users.add(user2);
		
		data.viewUsers();
		
		int flag;
		
		do {
			System.out.printf("\n ======== KICKSTARTER ========\n\n");
			System.out.println("- Type your option -");
			System.out.println("[1] Sign in\n" +
								"[2] Sign up\n" +
								"[0] Exit");
			
			int option = input.nextInt();
			flag = option;
			
			switch(option) {
				case 1:
					signInMenu();
					break;
				case 2:
					signUpMenu();
					break;
				default:
					break;
			}
			

		} while(flag != 0);
		
		//input.close();
	}
	
	public void signInMenu() {
		System.out.print("Type your email: ");
		String email = input.nextLine();
		System.out.print("Type your password: ");
		String password = input.nextLine();
		
		
	}
	
	public void signUpMenu() {
		input.nextLine();
		System.out.print("First name: ");
		String firstName = input.nextLine();
		System.out.print("Last name: ");
		String lastName = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		
		User newUser = new User(firstName, lastName, email, password);
		Data.users.add(newUser);
		data.viewUsers();
		
		
	}
	
}
