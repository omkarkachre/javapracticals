package com.inheritanceExample;

public class Engine extends Tyres{

	String name;
	Engine(){
		this.name = "Engine";
		super.name = "Tyre";
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
		
	public void StartEngine() {
		System.out.println("Engine started");
	}
	
	public void StopEngine() {
		System.out.println("Engine stopped");
	}
	
}
