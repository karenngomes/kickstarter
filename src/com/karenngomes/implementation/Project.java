package com.karenngomes.implementation;

import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Project implements Arquivable {
	protected static int idTotal;
	protected int id;
	protected String name;
	protected String description;
	protected User responsible;
	protected ArrayList<User> contributors;
	protected Categories category;
	protected Period timeCampaign;
	protected ArrayList<User> supporters;
	protected ArrayList<Comment> comments;
	protected boolean closed;
	
	static Scanner input = new Scanner(System.in);
	
	Project() {
		contributors = new ArrayList<User>();
		supporters = new ArrayList<User>();
		comments = new ArrayList<Comment>();
	}
	
	Project(User responsible) {
		this.id = idTotal++;
		this.responsible = responsible;
		
		System.out.print("Project name: ");
		String projectName = input.nextLine();
		this.name = projectName;
		System.out.print("Category: ");
		this.category.viewCategories();
		int categoryValue = input.nextInt();
		while(categoryValue < 1 && categoryValue > 15) {
			System.out.println("Invalid value! Try again: ");
			categoryValue = input.nextInt();
		}
		this.setCategory(categoryValue);
		
	}	
	
	Project(String name, User responsible, Categories category) {
		this.id = idTotal++;
		this.name = name;
		this.responsible = responsible;
		this.category = category;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getResponsible() {
		return responsible;
	}
	public void getContributors() {
		try {
			for(User contributor : this.contributors) {
				System.out.println(contributor.getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("This project doesn't have any contributor yet.");
		}
	}
	public void setContributors(User contributor) {
		this.contributors.add(contributor);
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(int categoryValue) {
		this.category.setValue(categoryValue);
	}
	
	public int getTimeCampaign() {
		return timeCampaign.getDays();
	}
	public void setTimeCampaign(int timeCampaign) {
		this.timeCampaign = Period.ofDays(timeCampaign);
	}

	public void getSupporters() {
		try {
			for(User supporter : this.supporters) {
				System.out.println(supporter.getFullName());
			}
		} catch(IndexOutOfBoundsException err) {
			System.out.println("This project doesn't have any supporter yet.");
		}
	}
	public void setSupporters(User supporter) {
		this.supporters.add(supporter);
	}
	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	
	public void viewProject() {
		System.out.println("Project name: " + this.getName());
		System.out.println("Project description: " + this.getDescription());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Time campaign: " + this.getTimeCampaign());
	}
	
}
