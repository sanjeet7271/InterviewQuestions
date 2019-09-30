package com.StringConvertions;
/**
 * 

 	1. Java – Convert String to int using Integer.parseInt(String) method
	2. Java – Convert String to int using Integer.valueOf(String) method
	The valueOf(String) method returns an object of Integer class whereas the parseInt(String) method returns a primitive int value.
 *
 *
 */
public class convertStringToInt {

	public static void main(String[] args) {
		
		String num="1212332";
		int n1=Integer.parseInt(num);
		int n2=Integer.valueOf(num);
		System.out.println(n1);
		System.out.println(n2);

	}

}
