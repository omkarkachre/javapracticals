package com.ArraysAndVector;

public class TwoDArray {

	String student_details[][] = {{"Sam", "Andheri"}, {"Ryan", "Dadar", "West"}, {"Sian"}};
	
	public void DisplayStudentDetails() {
		System.out.println(student_details.length); // How many elements are there
		for (int i=0; i < student_details.length; i++) {
			System.out.println(student_details[i].length); //length of each element
			for (int j=0; j < student_details[i].length; j++) {
				System.out.println(student_details[i][j]);
			}
		}
	}
	
}
