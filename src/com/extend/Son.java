package com.extend;

public class Son extends Father {
	
	private String fName;
	
	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Son(String name,String fName) {
		super(name);
		this.fName = fName;
	}
	
	public Son(){
		super();
	}
	

}
