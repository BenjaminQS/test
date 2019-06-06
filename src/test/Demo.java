package test;

public class Demo extends Thread{
	
	public void run(){
        for(int i=0;i<60;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

}
