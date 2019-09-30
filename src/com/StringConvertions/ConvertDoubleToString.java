package com.StringConvertions;
/**
 * 
		1. Java – Convert double to string using String.valueOf(double) method.
		2. Convert double to string in Java using toString() method of Double wrapper class.
		3. Java – double to string conversion using String.format() method
		4. Convert double to string using DecimalFormat.format()
		5. Java Convert double to string using StringBuffer and StringBuilder.
 *
 */
public class ConvertDoubleToString {

	public static void main(String[] args) {
		double d=123.2311;
		String str=String.valueOf(d);
		String str1=Double.toString(d);
		System.out.println(str);

		System.out.println(str1);
	}

}
