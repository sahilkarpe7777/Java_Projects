package com.threading;

public class thread1 extends Thread{
	
	public void run() {
		for(int i =1;i<=1000;i++) {
			count.counter();
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				
//			}
		}
	}
}
