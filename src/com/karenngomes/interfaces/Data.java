package com.karenngomes.interfaces;

import java.util.ArrayList;

import com.karenngomes.implementation.*;

public class Data {
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Project> allProjects = new ArrayList<Project>();
	static ArrayList<Message> allMessages = new ArrayList<Message>();
	
	public void addProjectInData(Project project) {
		Data.allProjects.add(project);
	}
	
	public void viewUsers() {
		try {
			for (User user : users) {
				System.out.println(user.getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("Doesn't have any user yet.");
		}
		
	}
	
	public void viewAllProjects() {
		try {
			for (Project project : Data.allProjects) {
				System.out.println(project.getName() + " by " + project.getResponsible().getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("Doesn't have any project yet.");
		}
	}
	
	public int verifyUser(String email, String password) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password)) 
				return i; 
		}
		return -1;
	}
	
	
	
}
