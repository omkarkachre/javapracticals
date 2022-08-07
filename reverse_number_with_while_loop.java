package com.reverseNumber;

public class reverse_number {

	public static int GenerateReverseNumber(int number_to_reverse) {
		
		int number = number_to_reverse;
		int remainder = 0;
		int reverse = 0;
		
		while (number != 0) {
			
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;
			
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		
		int reverse_number = GenerateReverseNumber(123456);
		System.out.println("Reverse Number: " + reverse_number);

	}

}
