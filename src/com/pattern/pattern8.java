package com.pattern;
/** 					Pattern Print
						 ***********
						  *********
						   *******
						    *****
						     ***
						      *
						      *
						     ***
						    *****
						   *******
						  *********
						 ***********

*/
public class pattern8 {
public static void main(String[] args) {
		
		for(int i=5;i>=0;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}