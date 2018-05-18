package com.karenngomes.implementation;

public class Comment implements Arquivable {
	
	private static int idTotal;
	private int id;
	private User sender;
	private Project receiver;
	private String comment;
	private boolean closed = false;
	
	public Comment(User sender, Project receiver, String message) {
		super();
		this.id = idTotal++;
		this.sender = sender;
		this.receiver = receiver;
		this.comment = message;
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
	public Project getReceiver() {
		return receiver;
	}
	public void setReceiver(Project receiver) {
		this.receiver = receiver;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		this.closed = true;
		return this.closed;
	}

	@Override
	public boolean reOpen() {
		// TODO Auto-generated method stub
		this.closed = false;
		return !this.closed;
	}

}
