package com.java.mutithread;

import java.util.HashMap;
import java.util.Map;

public class DriverClass {

	private static MyBlockingQueue<String> queue = new MyBlockingQueue<>(16);
	
	public static void main(String[] args) throws InterruptedException {
		 ThreadInitializationUsingThread usingThread = new ThreadInitializationUsingThread();
		 ThreadInitializationUsingThread usingThread2 = new ThreadInitializationUsingThread();
		 usingThread.setName("Thread 1");
		 usingThread.setPriority(10);
		 usingThread.setName("Thread 2");
		 usingThread.setPriority(10);
		 usingThread.start();
		 usingThread2.start();
		 
		 System.out.println("My name is siddhant");
		 
		 UsingRunable usingRunnable = new UsingRunable();
		 Thread thread = new Thread(usingRunnable);
		 thread.start();
		 
		 
		 Map<String,Integer> map = new HashMap<>();
		 
		 map.put("key1",1);
		 map.put("key2",2);
		 map.put("key3",3);
		 map.put("key4",4);
		 
		 System.out.println(map.toString());
		 map.computeIfAbsent("Key5", v->100+10);
		 map.computeIfPresent("key2", (k,v)->v+100);
		 map.computeIfPresent("Key8", (k,v)->v+100);
		 map.computeIfAbsent("Key2", v->100);
		 System.out.println(map.toString());
	}
}
