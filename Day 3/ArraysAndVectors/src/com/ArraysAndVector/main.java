package com.ArraysAndVector;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.print("Enter the size of array:");
		Scanner userinputObj = new Scanner(System.in);
		
		
		int userinput = userinputObj.nextInt();
		ArraysExample aa = new ArraysExample(userinput);
		
		// Getting the array size dynamically
		int size = aa.student_rollno.length;
		System.out.println("Size of array is: " + size);
		
		//Setting up the values of the array 
		for (int i = 0; i < size; i++) {
			aa.student_rollno[i] = i + 5;
		}
		
		// Printing out the array element
		for (int i = 0; i < size; i++) {				//Printing index		//Printing the value at that index
			System.out.println("Student roll at element: " + i + " is " + aa.student_rollno[i]);
		}
		*/
		
		//TwoDArray example = new TwoDArray();
		//example.DisplayStudentDetails();
		
		ThreeDArray example2 = new ThreeDArray();
		example2.GetData();
		example2.displayThreeDArray();

	}

}
