package com.singleton.example;

public final class SingleTon {

	private SingleTon singeleObject = new SingleTon();
	private SingleTon()
	{
		if(singeleObject == null)
			singeleObject = new SingleTon();
	}
	
	public SingleTon createInstance()
	{
		if(singeleObject == null)
		{
			singeleObject = new SingleTon();
		}
		
		return singeleObject;
	}
	
	
}

