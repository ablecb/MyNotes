package com.ys.p2;

import com.opensymphony.xwork2.ModelDriven;

public class UserAction2 implements ModelDriven<User> {
	
	private User user;
	
	public void addUser(){
		System.out.println(user);
	}

	@Override
	public User getModel() {
		
		user  = new User();
		
		
		return user;
	}

	


	

	
	
	
}
