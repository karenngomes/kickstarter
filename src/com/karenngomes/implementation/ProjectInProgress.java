package com.karenngomes.implementation;

public class ProjectInProgress extends Project {
	
	protected boolean closed = false;
	
	public ProjectInProgress(User responsible) {
		super(responsible);
	}

	public ProjectInProgress(String name, User responsible, Categories category) {
		super(name, responsible, category);
	}

	public void editProject() {
		System.out.println("What do you want edit?");
		System.out.println("[1] Basics information");
		System.out.println("[2] About You");
		
		int option = input.nextInt();
		
		switch(option) {
			case 1: 
				editBasicInformation();
				break;
			case 2: 
				this.getResponsible().viewProfile();
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
				this.getCategory().name();
				break;
			default:
				break;
		
		}
	}
	
	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return this.closed;
	}

	@Override
	public boolean reOpen() {
		// TODO Auto-generated method stub
		return !this.closed;
	}
	
	
}
