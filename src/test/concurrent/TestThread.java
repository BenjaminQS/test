package test.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestThread {
	
	public static void main(String[] args) {
		
		final Hero gareen = new Hero();
		gareen.name = "gareen";
		gareen.hp = 600;
		
		 Thread t1 = new Thread(){
	            public void run(){
	                while(true){
	                       
	                    //无需循环判断
//	                    while(gareen.hp==1){
//	                        continue;
//	                    }
	                       
	                    gareen.hurt();
	                     
	                    try {
	                        Thread.sleep(10);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	   
	            }
	        };
	        t1.start();
	   
	        Thread t2 = new Thread(){
	            public void run(){
	                while(true){
	                    gareen.recover();
	   
	                    try {
	                        Thread.sleep(10);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	   
	            }
	        };
	        t2.start();

    }
}
