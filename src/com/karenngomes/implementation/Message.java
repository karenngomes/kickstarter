package com.karenngomes.implementation;

public class Message implements Arquivable {
	
	private static int idTotal;
	private int id;
	private User sender;
	private User receiver;
	private String message;
	private boolean read = false;
	
	public Message(User sender, User receiver, String message) {
		super();
		this.id = idTotal++;
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}
	
	public static int getIdTotal() {
		return idTotal;
	}


	public static void setIdTotal(int idTotal) {
		Message.idTotal = idTotal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getSender() {
		return sender;
	}


	public void setSender(User sender) {
		this.sender = sender;
	}


	public User getReceiver() {
		return receiver;
	}


	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}
	
	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		this.read = true;
		return this.read;
	}

	@Override
	public boolean reOpen() {
		// TODO Auto-generated method stub
		this.read = false;
		return !this.read;
	}
	
}
