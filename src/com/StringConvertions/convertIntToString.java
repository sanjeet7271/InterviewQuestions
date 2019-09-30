package com.StringConvertions;
/**
 * 
 *
	We can convert int to String using String.valueOf() or Integer.toString() method. We can also use String.format() method for the conversion.
	
 *
 */
public class convertIntToString {

	public static void main(String[] args) {
		
		int n=1234;
		String str=String.valueOf(n);
		String str1=Integer.toString(n);
		System.out.println(str);
		System.out.println(str1);

	}

}
