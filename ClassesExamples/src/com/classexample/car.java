package com.classexample;

public class car {

	public static void main(String[] args) {
		
		engine engine1 =new engine();		// engine1 object created of engine class
		engine1.start();					// calling the engine class's function
		engine1.stop();
		
		electronics electronic1 = new electronics();
		electronic1.start();
		electronic1.stop();
		electronic1.start();
		electronic1.stop();
		electronic1.start();
		electronic1.stop();
		
		
	}

}
