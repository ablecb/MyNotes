package com.ys.p2;

public class StuAction {
	
	private int id;
	
	
	public void addStu(){
		System.out.println("增加学生信息..........");
	}
	
	public void selStu(){
		System.out.println("查询学生信息.........."+id);
	}
	
	public void delStu(){
		System.out.println("删除学生信息..........");
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
