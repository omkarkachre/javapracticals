package com.PrimeNumbers;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumberThreads p1 = new PrimeNumberThreads(1, 100);
		PrimeNumberThreads p2 = new PrimeNumberThreads(101, 200);
		PrimeNumberThreads p3 = new PrimeNumberThreads(201, 2000);
		
		p1.start();
		p2.start();
		p3.start();
		
		try {
			 
	        // join() method waits for the thread to die
	        p1.join();
	        p2.join();
	        p3.join();
	    }
	    catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

}
