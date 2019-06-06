package test;

public class Father extends GrandFather {
	
	private int id = 1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void speak() {
		System.out.println("I am father");
	}

}
