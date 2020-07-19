package com.singleton.example;

public class PrivateSingleTon {

	private static volatile PrivateSingleTon instance = null;
	private static Object mutex = new Object();
	private PrivateSingleTon()
	{
		
	}
	
	public PrivateSingleTon createInstance() 
	{
		PrivateSingleTon result = instance;
		if(result == null) {
			synchronized (mutex) {
				if(result == null)
					return result = instance = new PrivateSingleTon();
			}
		}
		
		return result;
	}
}
