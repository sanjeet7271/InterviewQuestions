package com.StringConvertions;
/**
 * 
 * 
	1. Java – Convert String to Double using Double.parseDouble(String) method
	2. Convert String to Double in Java using Double.valueOf(String)
	3. Java Convert String to double using the constructor of Double class – The constructor Double(String) is deprecated since Java version 9

 *
 */
public class convertStringToDouble {

	public static void main(String[] args) {
		
		String str="12345";
		double d=Double.parseDouble(str);
		double d2=Double.valueOf(str);
		System.out.println(d);
		System.out.println(d2);

	}

}
