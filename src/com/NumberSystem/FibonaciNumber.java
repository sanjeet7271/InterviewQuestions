package com.NumberSystem;

public class FibonaciNumber {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0;
		int n=15; //user can take using scanner
		for(int i=2;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(b+" ");
		}

	}

}
