package test.concurrent;

public class Hero {
	private String name; 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float hp; 
    public int damage;
    
    static String copyright;
    
    static{
    	System.out.println("initialize copyright ");
    	copyright = "Riot Games";
    }
    
    public void Hero(String name){
    	this.name = name;
    		
    }
    
    public synchronized void recover(){
    	hp = hp + 1;
    	System.out.printf("%s 回血1点，现在血量是 %.0f%n", name , hp);
    	if(hp >605)
    		try{
    			this.wait();
    		}catch(InterruptedException e){
    			e.printStackTrace();
    		}
    	else
    		this.notify();
    }
    
    public synchronized void hurt(){
    	
    	if(hp ==1){
    		try{
    			this.wait();
    		}catch(InterruptedException e){
    			e.printStackTrace();
    		}
    	}
    	else
    		this.notify();
//    	synchronized(this){
		hp = hp -1;
		System.out.printf("%s 减血后的血量是 %.0f%n", name, hp);
//    	}
    }
     
    public void attackHero(Hero h) {
//        try {
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s is attacking %s, %s left %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +"!");
    }
 
    public boolean isDead() {
        return 0>=hp?true:false;
    }
}
