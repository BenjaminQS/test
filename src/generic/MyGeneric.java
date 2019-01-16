package generic;

public class MyGeneric<T> {
	
	private T tobject;
	
	public MyGeneric(Class<T> tclass) throws InstantiationException, IllegalAccessException {
		this.tobject = tclass.newInstance();
	}

	public T getTobject() {
		return this.tobject;
	}
	
}
