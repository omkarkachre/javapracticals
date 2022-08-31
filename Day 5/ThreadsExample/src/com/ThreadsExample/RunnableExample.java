package com.ThreadsExample;

public class RunnableExample implements Runnable {
	String ThreadName;
	RunnableExample(String arg){
		ThreadName = arg;
	}
	
	public void run() {
		
		try {
			int a = 10/0;

		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divided by zero");
		}
		
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Thread " + ThreadName + " is saying Hi");
				
				Thread.sleep(3000);
			}
		}catch(Exception e) { //InterruptedException 
			e.printStackTrace();
		}
		
	}
}
