package com.sap;

import java.util.ArrayList;
import java.util.List;;

class StaticDemo{  
    public static void main(String[]args){  
         List list = new ArrayList();
         list.add("test");
         list.add(123);
         
         String s = (String)list.get(0);
         System.out.println("s:" + s);
         Integer i = (Integer)list.get(1);
         System.out.println("i:" + i);
   }  
}