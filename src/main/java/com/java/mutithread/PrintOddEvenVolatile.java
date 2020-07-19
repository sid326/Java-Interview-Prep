package com.java.mutithread;

public class PrintOddEvenVolatile {

	volatile static int number = 0;
	volatile static boolean isOdd = false;
	
	public void printOdd(int max)
	{
		while(max>=number) {
		while(!isOdd)
		{
			
		}
		synchronized (this) {
			if(isOdd && max>=number)
			{
				System.out.println(number+ " "+ Thread.currentThread());
				number++;
				isOdd = !isOdd;
			}
		}
		}
		
	}
	
	public void printEven(int max)
	{
		while(max>=number) {
		while(isOdd)
		{
			
		}
		synchronized (this) {
			if(!isOdd && max>=number)
			{
				System.out.println(number+ " "+ Thread.currentThread());
				number++;
				isOdd = !isOdd;
			}
		}
		
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		PrintOddEvenVolatile obj = new PrintOddEvenVolatile();
		
		Runnable printOdd = () ->{
			obj.printOdd(200);
		};
		Runnable printEven = () ->{
			obj.printEven(200);
		};
		
		Thread t1 = new Thread(printEven);
		Thread t2 = new Thread(printOdd);
		Thread t3 = new Thread(printEven);
		Thread t4 = new Thread(printOdd);
		t1.setName("Even thread-1");
		t2.setName("Odd thread-1");
		t3.setName("Even thread-2");
		t4.setName("Odd thread-2");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
