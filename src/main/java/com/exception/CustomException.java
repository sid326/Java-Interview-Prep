package com.exception;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message = new String("");
	public CustomException(String message)
	{
		super(message);
		this.message = message;
	}

	
}

class TestExcception{
	
	public static void main(String[] args) {
		
		try {
			
			Integer result = checkException();
			System.out.println(result);
			throw new CustomException("hello");
		}
		catch(CustomException ex)
		{
			System.out.println(ex.getMessage());
			
		}
	}
	
	
	@SuppressWarnings("finally")
	public static Integer checkException()
	{
		try
		{
			return 0;
		}
		finally
		{
			return 2;
		}
	}
}
