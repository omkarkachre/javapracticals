package com.abstractexample;

public abstract class animal implements animalInterface{

	public abstract void run(); //abstract method's body should be defined in another class which inherits this class
	
	public void watch() {		// non abstract method
		System.out.println("Watching with 12 eyes");
	}
}
