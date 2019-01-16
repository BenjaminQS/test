package generic;

public class MyGenericDemo {
	
	public static void main(String[] args) throws Exception{
		MyGeneric<Bar> mg = new MyGeneric<Bar>(Bar.class);
		Bar bar = mg.getTobject();
		bar.currentDate();
	}

}
