package com.sap1;

public class Person{  
    //成员变量，实例变量  
    String name;  
    //静态变量，类变量  
    //所有对象共享的属性用static修饰  
    static String country = "CN";  
    public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Person.country = country;
	}
	public void show(){  
         System. out.println(country + ":" + name);  
          //等效语句：System.out.println(Person.country+ ":" + this.name);  
   }  
    public static void test(){  
        System. out.println(country);  
         //等效语句：System.out.println(Person.country+ ":" + this.name);  
  }  
}  
