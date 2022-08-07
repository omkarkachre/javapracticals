package com.classexample;

public class engine {

 	public static String a;// Static variables and methods are there for a class and not just for an object
	
	public static void start(){
		int i = 0;
		a = "Starting";
		//while(i < 5) {
		//	System.out.print(i);
		//	i++;
		//}
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
		a = a + " stopping";
		System.out.println(a);
	}
}
