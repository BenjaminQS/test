package com.extend;

public class Father {
	private String name = "fathername";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String hello(){
		return getName();
	}

	public Father(String name) {
		super();
		this.name = name;
	}
	
	public Father() {
		
	}
	
}
