package com.inheritance;

public class DriverClass {

	public static void main(String[] args) {
		
		Shape shape = new Shape(4, 4);
		Shape square = new Square(3);
		Shape rect = new Rectangle(3, 4);
		Rectangle rect1 = new Rectangle(3, 4);
		
		int shapeArea = shape.area(4, 4);
		System.out.println(shapeArea);
		int squareArea = square.area(4,4);
		int rectArea = rect.area(4, 4);
		int rectArea1 = rect1.area(4, 4);
		System.out.println("Square Area:\t"+squareArea);
		System.out.println("Shape Reactangle Area:\t"+rectArea);
		System.out.println("Rectangle Area:\t"+rectArea1);
		
	
	}
}
