package com.inte;

public class Test {
	
	public static void main(String[] args){
		Person p = new Student(1);
		p.eat();
		Student s = (Student)p;
		s.eat();
		s.study();
		System.out.println("id " + s.getId());
	}

}
