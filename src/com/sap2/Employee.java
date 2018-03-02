package com.sap2;

public class Employee implements java.io.Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public void mailCheck(){
		System.out.println("mailing to" + name + " " + address);
	}
}
