package com.PrimeNumbers;
import java.util.*;

public class PrimeNumberThreads extends Thread{

	int min, max = 0;
	PrimeNumberThreads(int mn, int mx){
		min = mn;
		max = mx;	
	}
	
	public void run() {
		Vector<Integer> prime_number = new Vector<Integer>();
		int i = 0, num = 0;
		for (i = min; i <= max; i++) {
			
			int counter = 0;
			for (num = i; num >= 1; num--) {
				
				if(i % num == 0) {
					counter = counter + 1; //counter++;
				}
				
			}
			
			if (counter == 2) {
				prime_number.add(i);
			}
			
		}
		for(int j = 0; j < prime_number.size(); j++) {
			System.out.print(prime_number.get(j) + ", ");
		}
		
		System.out.println();
	}
}
