package generic;

public class GArrayDemo {
	
	public static void main(String[] args) {
		GArray<Integer> garray = new GArray<Integer>(Integer.class);
		Integer[] myArray = garray.getMyArray();
		
		myArray[0] = 0;
		myArray[7] = 7;
	}

}