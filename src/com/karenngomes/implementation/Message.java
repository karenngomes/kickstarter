package com.karenngomes.implementation;

public class Message {
	
	private static int idTotal;
	private int id;
	private User sender;
	private User receiver;
	private String mensagem;
		
	public Message(User sender, User receiver, String message) {
		super();
		this.id = ++idTotal;
		this.sender = sender;
		this.receiver = receiver;
		this.mensagem = message;
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


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
