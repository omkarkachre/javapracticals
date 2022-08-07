package com.classexample;

public class car {

	public static void main(String[] args) {
		
		engine engine1 =new engine();		// engine1 object created of engine class
		engine1.start(9);					// calling the engine class's function
		engine1.stop();
		engine1.start();	
		engine1.start(6, 4);
		
		
		electronics electronic1 = new electronics();
		electronic1.start();				// Overriding the method
		
		
		
	}

}
