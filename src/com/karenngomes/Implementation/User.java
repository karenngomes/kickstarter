package com.karenngomes.Implementation;

import java.util.ArrayList;

public class User {
	private String name;
	private boolean age18;
	private String biography;
	private String email;
	private String login;
	private String password;
	private String website;
	private Countries country;
	private ArrayList<Project> createdProjects;
	private ArrayList<Project> supportedProjects;
	private ArrayList<Message> messages;
	private ArrayList<User> followers;
	private ArrayList<User> following;
	
	//constructor
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
		
}
