package com.example.demo;

public class StringExample {

	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello").intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		Integer intValue = new Integer(4);
		System.out.println(Integer.toHexString(intValue));
		
		integerValue(4);
	}
	
	public static void integerValue(Integer intValue)
	{
		System.out.println("Inside Integer Method");
	}
	
	public static void integerValue(int intValue)
	{
		System.out.println("Inside int Method");
	}
	
	public static void integerValue(Object intValue)
	{
		System.out.println("Inside Object Method");
	}
}
