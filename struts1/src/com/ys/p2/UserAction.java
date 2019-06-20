package com.ys.p2;

public class UserAction {
	
	private User user;
	
	public void addUser(){
		System.out.println(user);
	}

	
	public User getUser() {
		System.out.println("getUser.................");
		return user;
	}


	public void setUser(User user) {
		System.out.println("setUser.............");
		this.user = user;
	}


	

	
	
	
}
