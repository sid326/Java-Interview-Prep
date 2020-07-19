package com.inheritance;

public class Square extends Shape{

	int width;
	public Square(int width)
	{
		super(width,width);
		System.out.println("This is from Square Class");
		this.width = width;
	}
	
	public Integer area(int width)
	{
		System.out.println("This is from Square Class");
		return width*-1;
	}
	
}
