package com.karenngomes.implementation;

import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	private static int idTotal;
	private int id;
	private String name;
	private String description;
	private User responsible;
	private ArrayList<User> contributors;
	private Categories category;
	private Period timeCampaign;
	//private double campaignGoalValue;
	private ArrayList<User> supporters;
	
	//constructor
	Project(String name, User responsible, Categories category) {
		this.id = idTotal;
		this.name = name;
		this.responsible = responsible;
		this.category = category;
		idTotal++;
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
	public void setResponsible(User responsible) {
		this.responsible = responsible;
	}
	public ArrayList<User> getContributors() {
		return contributors;
	}
	public void setContributors(ArrayList<User> contributors) {
		this.contributors = contributors;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public Period getTimeCampaign() {
		return timeCampaign;
	}
	public void setTimeCampaign(Period timeCampaign) {
		this.timeCampaign = timeCampaign;
	}
	/*public double getCampaignGoalValue() {
		return campaignGoalValue;
	}
	public void setCampaignGoalValue(double campaignGoalValue) {
		this.campaignGoalValue = campaignGoalValue;
	}*/
	public ArrayList<User> getSupporters() {
		return supporters;
	}
	public void setSupporters(ArrayList<User> supporters) {
		this.supporters = supporters;
	}
	
	static Scanner input = new Scanner(System.in);
	
	public void viewProject() {
		
	}
	
	public void editProject() {
		System.out.println("What do you want edit?");
		System.out.println("[1] Basics information");
		System.out.println("[2] Rewards");
		System.out.println("[3] About You");
		System.out.println("[4] Account");
		
		int option = input.nextInt();
		
		switch(option) {
			case 1: 
				editBasicInformation();
				break;
			case 2: 
				editRewards();
				break;
			case 3: 
				break;
			case 4:
				
				break;
			default:
				break;
		
		}
	}
	
	public void editBasicInformation() {
		System.out.println("Which basic information do you want edit?");
		System.out.println("[1] Project Title");
		System.out.println("[2] Short Blurb");
		System.out.println("[3] Category");
		
		int option = input.nextInt();
		
		switch(option) {
			case 1: 
				System.out.println("These words will help people find your project, so choose them wisely!");
				String newName = input.nextLine();
				this.setName(newName);
				break;
			case 2: 
				System.out.println("Give people a sense of what you’re doing. Skip “Help me” and focus on what you’re making.");
				String newDescription = input.nextLine();
				this.setDescription(newDescription);
				break;
			case 3: 
				
				break;
			default:
				break;
		
		}
	}
	
	public void editRewards() {
		
	}
	
	
}
