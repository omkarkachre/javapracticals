package com.ThreadsExample;

public class ThreadsExample extends Thread {

	String ThreadName;
	ThreadsExample(String arg){
		ThreadName = arg;
	}
	
	public void run() {
		int i = 0;
		
		while(i < 1000000000) {
			System.out.println("Thread \" + ThreadName + \" is saying Hi");
		}
		
		/*
		try {
			int a = 10/0;

		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divided by zero");
			//e.printStackTrace();
			//System.out.println(e);
		}
		
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Thread " + ThreadName + " is saying Hi");
				
				Thread.sleep(3000);
			}
		}catch(Exception e) { //InterruptedException 
			e.printStackTrace();
		}
		*/
	}
}
