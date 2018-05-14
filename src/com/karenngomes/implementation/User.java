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
	
	//constructor
	
	public User(String firstName, String lastName, String email, String password) {
		super();
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
	public ArrayList<Project> getCreatedProjects() {
		return createdProjects;
	}
	public void setCreatedProjects(ArrayList<Project> createdProjects) {
		this.createdProjects = createdProjects;
	}
	public ArrayList<Project> getSupportedProjects() {
		return supportedProjects;
	}
	public void setSupportedProjects(ArrayList<Project> supportedProjects) {
		this.supportedProjects = supportedProjects;
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	public ArrayList<User> getFollowers() {
		return followers;
	}
	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}
	public ArrayList<User> getFollowing() {
		return following;
	}
	public void setFollowing(ArrayList<User> following) {
		this.following = following;
	}
	
	public void viewProfile() {
		
		Scanner input = new Scanner(System.in);
		
		int flag;
		
		do {
			System.out.printf("\n ======== WELCOME, %s! ========\n\n", this.getFirstName());
			System.out.println("- Type your option -");
			System.out.println("[1] My Account\n" +
								"[2] My projects\n" +
								"[3] Messages" +
								"[4] Following" +
								"[5] Followers" +
								"[0] Exit");
			
			int option = input.nextInt();
			flag = option;
			
			switch(option) {
			case 2:
				if(this.createdProjects.size() == 0)
					System.out.println("You don't have any project yet. Create one!");
				else
					this.getCreatedProjects();
				break;
			}
			

		} while(flag != 0);
	}
	
		
}
