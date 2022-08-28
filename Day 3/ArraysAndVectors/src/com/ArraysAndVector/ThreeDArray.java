package com.ArraysAndVector;
import java.util.Scanner;
public class ThreeDArray {

	/*
	String student_details[][][] = {
			{
				{
					"Ryan", "Dsouza"
				},
				{
					"Sam", "Andrew", "Garfield"
				},
				{
					"Christian"
				}
			},
			{
				{
					"Bhavesh", "Rane"
				},
				{
					"Ninja", "Hattori"
				}
			},
			
	};
	*/
	String student_details[][][] = new String[2][2][3];
	
	public void GetData() {
		
		Scanner getdata = new Scanner(System.in);
		
		for (int i = 0; i < student_details.length; i++) {
			for (int j = 0; j < student_details[i].length; j++) {
				for (int k = 0; k < student_details[i][j].length; k++) {
					if (j == 0) {
						System.out.println("Enter Details of Dadar Students");
					}
					if (j == 1) {
						System.out.println("Enter Details of Andheri Students");
					}
					if(k == 0) {
						System.out.println("Enter First Name");
						student_details[i][j][k] = getdata.next();
					}
					if (k == 1) {
						System.out.println("Enter Middle Name");
						student_details[i][j][k] = getdata.next();
					}
					if (k == 2) {
						System.out.println("Enter Last Name");
						student_details[i][j][k] = getdata.next();
					}
					
				}
			}
		}
	}
	
	public void displayThreeDArray() {
		
		//System.out.println("Length of i: " + student_details.length);
		for (int i = 0; i < student_details.length; i++) {
			//System.out.println("Length of j: " + student_details[i].length);
			for (int j = 0; j < student_details[i].length; j++) {
				//System.out.println("Length of k: " + student_details[i][j].length);
				for (int k = 0; k < student_details[i][j].length; k++) {
					System.out.println(student_details[i][j][k]);
				}
				
			}
		}
	}
}
