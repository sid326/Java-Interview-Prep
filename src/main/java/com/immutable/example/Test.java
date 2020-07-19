package com.immutable.example;
class Test{
	
	public static void main(String[] args) {
		
		Immutable testObj = new Immutable(271171, "Siddhant");
		System.out.println(testObj.toString());
		Immutable testObj2 = new Immutable(271171, "Siddhant");
		System.out.println(testObj.toString());
		System.out.println(testObj2.toString());
		
		
		if(testObj.equals(testObj2))
		{
			System.out.println(testObj==testObj2);
		}
	}
}