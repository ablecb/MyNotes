package com.ys.p2;

public class User {
	
	private String user;
	private String sex;
	private String age;
	private String email;
	private String zy;
	private String addr;
	
	
	public void setUser(String user) {
		this.user = user;
	}


	public void setSex(String sex) {
		System.out.println("sex");
		this.sex = sex;
	}


	public void setAge(String age) {
		System.out.println("age");
		this.age = age;
	}


	public void setEmail(String email) {
		System.out.println("email");
		this.email = email;
	}


	public void setZy(String zy) {
		System.out.println("zy");
		this.zy = zy;
	}


	public void setAddr(String addr) {
		System.out.println("addr");
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "User [user=" + user + ", sex=" + sex + ", age=" + age + ", email=" + email + ", zy=" + zy + ", addr="
				+ addr + "]";
	}
	
}
