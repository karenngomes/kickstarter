package com.karenngomes.interfaces;

import java.util.ArrayList;

import com.karenngomes.implementation.*;

public class Data {
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Project> projectsAll = new ArrayList<Project>();
	
	//ArrayList<Message> messages;
	
	public void addProject(Project project) {
		Data.projectsAll.add(project);
	}
	
	public void viewUsers() {
		for (User user : Data.users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
	}
	
}
