package com.inte;

public class Student implements Person {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Student(int id){
		this.id = id;
	}

	public void study(){
		System.out.println("stu study");
	}
	
	@Override
	public void eat(){
		System.out.println("stu eat");
	}

}
