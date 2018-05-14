package com.karenngomes.implementation;

import java.time.Period;
import java.util.ArrayList;

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
	
	
}
