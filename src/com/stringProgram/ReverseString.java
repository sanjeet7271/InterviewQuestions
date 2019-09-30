package com.stringProgram;

import java.util.Stack;

public class ReverseString {
	
	public String reverse1(String str) {
		char[] ch=str.toCharArray();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<ch.length;i++) {
			st.push(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			ch[i]=st.peek();
			st.pop();
		}
		return String.valueOf(ch);
	}
	public void reverse2(String str) {
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1;i>0;i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
	public void reverse3() {
		
	}

	public static void main(String[] args) {
	
		ReverseString reverse=new ReverseString();
		String str="Hello world India";
		
		System.out.println("Reverse method one :"+reverse.reverse1(str));
		System.out.println("Reverse methos two 2nd :");
		reverse.reverse2(str);
	}

}
