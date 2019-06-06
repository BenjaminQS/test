package test.exception;

public class CustomException extends Exception{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public CustomException(){
		super();
	}
	
	public CustomException(String message){
		super(message);
	}
	
	 // 用指定的详细信息和原因构造一个新的异常
    public CustomException(String message, Throwable cause){

        super(message,cause);
    }

    //用指定原因构造一个新的异常
     public CustomException(Throwable cause) {

         super(cause);
     }

	

}
