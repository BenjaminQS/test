package com.sap2;

public class ThreadTest extends Thread {
	
	private int ticket = 100;
	  public void run(){
	    while(true){
	      if(ticket > 0){
	        System.out.println(Thread.currentThread().getName() +
	          "is saling ticket" + ticket--);
	      }else{
	        break;
	      }
	    }
	  }

}
