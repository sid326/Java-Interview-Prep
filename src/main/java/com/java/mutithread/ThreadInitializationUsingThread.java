package com.java.mutithread;

public class ThreadInitializationUsingThread extends Thread{
	
	int count = 0;
	@Override
	public void run()
	{
		for(int i =0;i<5;i++) {
			System.out.println("My Name is "+currentThread().getName()+" "+count++);
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
