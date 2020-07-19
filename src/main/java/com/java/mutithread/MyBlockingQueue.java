package com.java.mutithread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

	private Queue<E> queue;
	int max = 16;
	private ReentrantLock lock = new ReentrantLock(true);
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public MyBlockingQueue(int size)
	{
		this.queue = new LinkedList<>();
		this.max = size;
	}
	
	public void put(E message) throws InterruptedException
	{
		lock.lock();
		try {
			if(queue.size()==this.max)
				notEmpty.await();
			
			queue.add(message);
			notFull.signalAll();
		} 
		finally {
			lock.unlock();
		}
	}
	
	public E take() throws InterruptedException
	{
		lock.lock();
		try {
			if(queue.isEmpty())
				notFull.await();
			E message = queue.poll();
			notEmpty.signalAll();
			return message;
		}
		finally
		{
			lock.unlock();
		}
		
	}
}
