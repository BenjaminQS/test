package generic;

public class GenericArray<T> {
	
	private T[] array;
	
	public GenericArray(T[] array){
		this.array = array;
	}
	
	public T[] getArray() {
		return this.array;
	}
	
	public T getLastElement() {
		if (this.array == null || this.array.length == 0) {
			return null;
		}
		return this.array[this.array.length - 1];
	}

}
