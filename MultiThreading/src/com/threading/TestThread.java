package com.threading;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 a = new thread1();
		a.start();
		
		theread2 b = new theread2();
		b.start();
		
		System.out.println(thread1.activeCount());
		try {
			a.join();
			b.join();
		}
		catch(Exception e) {
			
		}
		int c = count.counter();
		
		System.out.println(c);
	}

}
