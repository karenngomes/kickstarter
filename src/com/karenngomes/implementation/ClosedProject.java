package com.karenngomes.implementation;

public class ClosedProject extends Project {

	protected boolean closed = true;
	
	ClosedProject(String name, User responsible, Categories category) {
		super(name, responsible, category);
		// TODO Auto-generated constructor stub
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
