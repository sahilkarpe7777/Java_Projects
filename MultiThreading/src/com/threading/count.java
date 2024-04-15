package com.threading;

public class count {
	static int count1 = 0;
	public synchronized static int counter() {
		return count1++;
	}
	
}
