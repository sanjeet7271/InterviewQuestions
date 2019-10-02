package com.stringProgram;
/**
 * 
 * Count Uppercase, Lowercase, special character and numeric values
 *
 */
public class CountStrings {
	
	public static void main(String[] args) {
		String str="GeekFor123@$ggadTK%^%&*";
		int upper=0,lower=0,number=0,special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				upper++;
			}else if(ch>='a' && ch<='z') {
				lower++;
			}else if(ch>='0' && ch<='9') {
				number++;
			}else {
				special++;
			}
		}
		System.out.println("Upper case :"+upper);
		System.out.println("lower case :"+lower);
		System.out.println("numbers :"+number);
		System.out.println("special:"+special);
	}

}
