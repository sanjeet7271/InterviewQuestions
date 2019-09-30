package com.stringProgram;

public class ReverseStringUsingRecursion {
	public void swap(String str1[],String str2[]) {
		
	}
	public void Recursion(String str) {
		int i=0;
		int n=str.length();
		if(i==n/2) {
			return;
		}
		//swap(str[i],str[n-i-1]);
		i=i+1;
		Recursion(str);
		
	}
	public static void main(String[] args) {
		ReverseStringUsingRecursion obj=new ReverseStringUsingRecursion();
		String str="SAnjeet Kumar";
		obj.Recursion(str);
		System.out.println(str);

	}

}
