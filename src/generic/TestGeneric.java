package generic;

public class TestGeneric {
	
	public static void main(String[] args) {
		PhoneNameEntry<Integer, String> entry = new PhoneNameEntry<Integer, String>(100, "hundred");
		System.out.println("num:" + entry.getKey());
		System.out.println("value:" + entry.getValue());
	}

}