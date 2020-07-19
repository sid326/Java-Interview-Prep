package com.inheritance;

public class Rectangle extends Shape {

	int width;

	public Rectangle(int width, int height) {
		super(width, height);
		System.out.println("This is from Rectangle Class");
		this.width = width;
		this.height = height;
	}

	public Integer area(int width, int height) {
		System.out.println("This is from Rectangle Class");
		return width * 0;
	}
}
