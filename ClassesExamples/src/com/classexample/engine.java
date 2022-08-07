package com.classexample;

public class engine {

	
	public static void start(){
		int i = 0;
		while(i < 5) {
			System.out.print("*");
			i++;
		}
	}
	
	public static void start(int i){
		int a = 0;
		while(a < i) {
			System.out.print("$");
			a++;
		}
	}
	
	public static void start(int i, int a){
		while(a < i) {
			System.out.print("#");
			a++;
		}
	}
	
	
	
	public static void stop() {
		System.out.println("stopping the car");
	}
}
