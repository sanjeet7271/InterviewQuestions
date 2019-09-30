package com.pattern;

/** 					Pattern Print
					      *
					     ***
					    *****
					   *******
					  *********
					 ***********

*/
public class pattern23 {

	public static void main(String[] args) {
		//int n=5;
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
