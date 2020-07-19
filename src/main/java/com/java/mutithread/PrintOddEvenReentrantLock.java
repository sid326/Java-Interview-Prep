package com.java.mutithread;

import java.util.concurrent.locks.ReentrantLock;

public class PrintOddEvenReentrantLock {

	private static ReentrantLock lock = new ReentrantLock(true);
	volatile static int number = 0;
	public static void main(String[] args) {
		
		
		Runnable printOdd = ()->
		{
			while(true) {
				printOdd(number);
				number++;
				
			}
		};
		
		Runnable printEven = ()->
		{
			while(true)
			{
				printOdd(number);
				number++;
			}
				
		};
		
		Thread odd = new Thread(printOdd);
		odd.setName("Odd Thread-1");
		odd.start();
		Thread even = new Thread(printEven);
		even.setName("Even Thread-1");
		even.start();
		
	}
	
	
	
	public synchronized final static void printOdd(Integer value)
	{
		lock.lock();
		System.out.println(value+ " "+ Thread.currentThread());
		lock.unlock();
	}
	
	public synchronized final static void printEven(Integer value)
	{
		lock.lock();
		System.out.println(value+" even");
		lock.unlock();
	}
}
