package com.ArraysAndVector;
import java.util.*;

public class VectorsExample {

	Vector<String> student_details = new Vector<String>();
	
	Vector v1 = new Vector();

	
	
	public void SetStudentDetails() {
		//student_details.add("Ryan");
		//student_details.add("Sam");
		
		v1.add(1);				// to add element
		v1.add(0.1);
		v1.add("hello");
		v1.add('c');
		
	}
	
	public void DisplayStudentDetails() {
		// First method
		//System.out.println(student_details);
		
		//for (int i = 0; i < student_details.size(); i++) {
			//System.out.print(student_details.get(i) + ",");
		//}
		
		for (int i = 0; i < v1.size(); i++) {		//size() method returns the size of the vector
			System.out.print(v1.get(i) + ",");
		}
		
		v1.remove(3);			// remove method allows you to remove the value from particular index
		System.out.println("Vector after removing 4th index: " + v1);
		v1.clear();			// clear method clears the entire vector
		System.out.println("Vector after Clear: " + v1);
	}
	
}
