/**
 * 
 */
/**
 * @author I324402
 *
 */
package com.extend;

public class Test{
	
	private Father f;
	
	
	public Father getF() {
		return f;
	}


	public void setF(Father f) {
		this.f = f;
	}
	
	public Son getS() {
		return (Son)f;
	}

	//	Son s = getS();
//	s.setName("hello");
	
	
	
	
	


	public static void main(String[] args){
		Son s = new Son("son", "father");
		System.out.println(s.hello());
		
	}
}