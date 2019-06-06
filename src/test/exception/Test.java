package test.exception;

import pojo.Hero;

public class Test {
//	String name;
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
	public static void helloException() throws CustomException{
		
		int a = 5;
		if(a > 1){
			throw new CustomException("Hello Exception");
		}
		
		Hero h = new Hero();
		h.getArmor();
	}
	
//	static Integer s;
//	
//	static{
//		Hero h = new Hero();
//		h.setName("heroName");
//		System.out.println(h.getName());
//	}
//	
//	Test(){
//		System.out.println("TestConstructor");
//	}
	
	public static void main(String[] args){
		try {
			helloException();
		} catch (CustomException e) {
//			e.getCause().printStackTrace();
			System.out.println("hello");
		}
		
//		Hero h = new Hero();
//		h.test();
//		Hero.test();
//		Test t = new Test();
		
		System.out.println("hello");
	}

}
