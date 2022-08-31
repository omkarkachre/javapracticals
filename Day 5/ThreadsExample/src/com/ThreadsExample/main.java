package com.ThreadsExample;

public class main {

	public static void main(String args[]) {
		ThreadsExample t1 = new ThreadsExample("Thread-1");
		ThreadsExample t2 = new ThreadsExample("Thread-2");
		ThreadsExample t3 = new ThreadsExample("Thread-3");
			
		t1.start();		// Start can run the run() method automatically
		t2.start();
		t3.start();
	}
	
}
