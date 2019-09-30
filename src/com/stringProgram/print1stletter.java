package com.stringProgram;

public class print1stletter {

	public static void main(String[] args) {
		String str="Hello My Name is sanjeet and I am from INDIA";
		String input=" "+str;
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			System.out.print(word.charAt(0));
		}

	}

}
