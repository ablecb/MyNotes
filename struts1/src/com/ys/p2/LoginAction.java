package com.ys.p2;

import java.util.HashMap;

public class LoginAction {
	
	private String user1;
	private String pass1;
	
	public String login(){//如果你要有视图跳转  
				
		if(user1.equals("admin") && pass1.equals("123456")){
			
			return "sc";//逻辑视图名字
			
		}else{
			
			return "er";
		}
		
	}

	public void setUser(String user) {
		
		HashMap<String, String> initParam = new HashMap<>();
		
		initParam.put("struts.reflectionContextFactory", "a");
		
		
		
		this.user1 = user;
	}

	public void setPass(String pass) {
		this.pass1 = pass;
	}
	
	
}
