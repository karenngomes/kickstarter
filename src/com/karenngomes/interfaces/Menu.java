package com.karenngomes.interfaces;

import java.util.Scanner;

import com.karenngomes.implementation.*;

public class Menu {
	
	static Scanner input = new Scanner(System.in);
	
	Data data = new Data();
	
	public void mainMenu() {

		User currentUser;
		currentUser = null;
		
		do {
			System.out.printf("\n ======== KICKSTARTER ========\n\n");
			System.out.println("- Type your option -\n");
			System.out.println("[1] View all projects\n" +
								"[2] Sign in\n" +
								"[3] Sign up\n" +
								"[0] Exit");
			
			int option = input.nextInt();
			
			switch(option) {
				case 0:
					return;
				case 1:
					data.viewAllProjects();
					//
					break;
				case 2:
					currentUser = signInMenu();
					break;
				case 3:
					currentUser = signUpMenu();
					break;
				default:
					System.out.println("Invalid Option! Try again.");
					break;
			}
			
			if(currentUser != null) {
				currentUser.viewProfile();
			} 
			
		} while(true);
		
	}
	
	public User signInMenu() {
		input.nextLine();
		System.out.print("Type your email: ");
		String email = input.nextLine();
		System.out.print("Type your password: ");
		String password = input.nextLine();
		int index = data.verifyUser(email, password);
		//System.out.println(index);
		if(index == -1) {
			System.out.println("The email address and password you entered do not match.\nTry again.");
			return null;
		}
		return Data.users.get(index);
		
}
	
	public User signUpMenu() {
		input.nextLine();
		System.out.print("First name: ");
		String firstName = input.nextLine();
		System.out.print("Last name: ");
		String lastName = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		
		for (User user : Data.users) {
			if(user.getEmail().equals(email)) {
				System.out.println("This email is already registered. User not created.");
				return null;
			}
		}
		
		System.out.print("Password: ");
		String password = input.nextLine();
		
		User newUser = new User(firstName, lastName, email, password);
		Data.users.add(newUser);
		data.viewUsers();
		return newUser;
		
	}
	
}
