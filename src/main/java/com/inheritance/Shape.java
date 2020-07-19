package com.inheritance;

public class Shape {

	int height;
	int width;
	public Shape(int height, int width)
	{
		System.out.println("Constructor from Shape class");
		this.height = height;
		this.width = width;
	}
	
	public Integer area(int width, int height)
	{
		System.out.println("This is from Shape Class");
		return width*height;
	}
}
