package com.karenngomes.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	private String firstName;
	private String lastName;
	private boolean age18;
	private String biography;
	private String email;
	private String password;
	private String website;
	private Countries country;
	private ArrayList<Project> createdProjects;
	private ArrayList<Project> supportedProjects;
	private ArrayList<Message> messages;
	private ArrayList<User> followers;
	private ArrayList<User> following;
	
	User() {
		createdProjects = new ArrayList<Project>();
		supportedProjects = new ArrayList<Project>();
		messages = new ArrayList<Message>();
		followers = new ArrayList<User>();
		following = new ArrayList<User>();
	}
	
	
	public User(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		System.out.println("Created account!");
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	public boolean isAge18() {
		return age18;
	}
	public void setAge18(boolean age18) {
		this.age18 = age18;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Countries getCountry() {
		return country;
	}
	public void setCountry(Countries country) {
		this.country = country;
	}
	
	public void getCreatedProjects() {
		try {
			for(Project project : this.createdProjects) {
				System.out.println(project.getName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("You don't create any project yet.");
		}
	}
	public void setCreatedProjects(Project createdProject) {
		this.createdProjects.add(createdProject);
	}
	public void getSupportedProjects() {
		try {
			for(Project project : this.supportedProjects) {
				System.out.println(project.getName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("You don't support any project yet.");
		}
	}
	public void setSupportedProjects(Project supportedProject) {
		this.supportedProjects.add(supportedProject);
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	public void getFollowers() {
		try {
			for(User followers : this.followers) {
				System.out.println(followers.getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("This user doesn't have any followers yet.");
		}
		
	}
	public void setFollowers(User follower) {
		this.followers.add(follower);
	}
	public void getFollowing() {
		try {
			for(User following : this.following) {
				System.out.println(following.getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("This user doesn't have any following yet.");
		}
	}
	public void setFollowing(User following) {
		this.following.add(following);
	}

	static Scanner input = new Scanner(System.in);
	
	public void viewProfile() {
		
		do {
			System.out.printf("\n ======== WELCOME, %s! ========\n\n", this.getFirstName());
			System.out.println("- Type your option -");
			System.out.println("[1] My Account\n" +
								"[2] My projects\n" +
								"[3] Following\n" +
								"[4] Followers\n" +
								"[5] Edit Account\n" +
								"[0] Exit");
			
			int option = input.nextInt();
			
			switch(option) {
				case 0:
					return;
				case 1:
					myAccount();
					break;
				case 2:
					if(createdProjects.size() == 0) 
						System.out.println("You don't have any project yet.");
					else
						getCreatedProjects();
					
					System.out.println("Do you want create one now? [Y/N]");
					if(input.nextLine().toUpperCase().equals("Y")) {
						Project newProject = new ProjectInProgress(this);
						setCreatedProjects(newProject);
					}
					
					break;
				case 3:
					getFollowing();
					break;
				case 4:
					getFollowers();
					break;
				case 5:
					editAccount();
				default:
					System.out.println("Invalid Option! Try again.");
					break;
			}
			

		} while(true);
	}
	
	public void myAccount() {
		System.out.println("First name: " + this.getFirstName());
		System.out.println("Last name: " + this.getLastName());
		System.out.println("Email: " + this.getEmail());
		System.out.println("My biography: " + this.getBiography());
	}
	
	public void editAccount() {
		
		System.out.printf("\nHello, %s.\nWhat do you want edit?\n", this.getFirstName());
		System.out.println("[1] First name");
		System.out.println("[2] Last name");
		System.out.println("[3] Email");
		System.out.println("[4] Password");
		System.out.println("[5] Your biography");
		
		int option = input.nextInt();
		
		switch(option) {
			case 1: 
				String firstName = input.nextLine();
				this.setFirstName(firstName);
				break;
			case 2: 
				String lastName = input.nextLine();
				this.setLastName(lastName);
				break;
			case 3: 
				String email = input.next();
				this.setEmail(email);
				break;
			case 4:
				System.out.print("Type the new password: ");
				String password = input.next();
				this.setPassword(password);
				break;
			case 5:
				String aboutYou = input.next();
				this.setBiography(aboutYou);
				break;
			default:
				break;
		
		}
		
	}
		
}
