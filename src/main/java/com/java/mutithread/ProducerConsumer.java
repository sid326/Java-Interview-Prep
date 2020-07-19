package com.java.mutithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;

public class ProducerConsumer {

	
//	static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
	static MyBlockingQueue<String> queue = new MyBlockingQueue<String>(10);
	
	volatile static int count = 0;
	public final static Runnable producer() throws InterruptedException
	{
		while(true)
		{
			queue.put("Siddhant");
//			System.out.println(queue.element());
		}
	}
	
	public static final Runnable consumer() throws InterruptedException
	{
		while(true)
		{
			System.out.println("under consumer");
			String message = queue.take();
			System.out.println("Message consumed is "+message);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		final Runnable producer = ()->{
			
			while(true)
			{
				try {
					queue.put("Siddhant");
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		};
		
		final Runnable consumer = () -> {

			while (true) {
				try {
					
					System.out.println("under consumer");
					String message = queue.take();
					System.out.println("Message consumed is "+message);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		
		new Thread(consumer).start();
		new Thread(producer).start();
		new Thread(consumer).start();
		new Thread(producer).start();
		
//		Runnable runProducer = producer();
//		Runnable runConsumer = consumer();
//		
//		new Thread(runProducer).start();
//		new Thread(runConsumer).start();
//		new Thread(consumer()).start();
//		
//		new Thread(producer()).start();
//		new Thread(producer()).start();
//		
//		
//		
//		
//		new Thread(consumer()).start();
//		new Thread(consumer()).start();
//		
//		Thread.sleep(100000);
	}
	
	
}
