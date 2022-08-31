package com.ThreadsExample;

public class main {

	public static void main(String args[]) {
		
		//When Extending Thread class
		ThreadsExample t1 = new ThreadsExample("Thread-1");
		ThreadsExample t2 = new ThreadsExample("Thread-2");
		ThreadsExample t3 = new ThreadsExample("Thread-3");
		ThreadsExample t4 = new ThreadsExample("Thread-4");
		ThreadsExample t5 = new ThreadsExample("Thread-5");
			
		t1.start();		// Start can run the run() method automatically
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		//When Implementing Runnable Interface
		RunnableExample obj1 = new RunnableExample("Thread-1");
		RunnableExample obj2 = new RunnableExample("Thread-2");
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		//th1.start();
		//th2.start();
	}
	
}
