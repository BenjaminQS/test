package test;

public class Human {
	private Hero hero;

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
	public void speak(){
		System.out.println(getHero().getName());
	}
		
}

