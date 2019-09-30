package com.NumberSystem;

public class ReversingNumber {

	public static void main(String[] args) {
		
		int n=124323;
		int remainder, reverseNumber=0;
		while(n>0) {
			remainder=n%10;
			reverseNumber=reverseNumber*10+ remainder;
			n=n/10;
		}
		System.out.println("Reversed Number :"+reverseNumber);

	}

}
