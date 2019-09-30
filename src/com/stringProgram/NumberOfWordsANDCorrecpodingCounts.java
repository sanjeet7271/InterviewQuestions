package com.stringProgram;

public class NumberOfWordsANDCorrecpodingCounts {

	public static void main(String[] args) {
		
		String str="Hello guys My Name is Sanjeet and I am from INDIA";
		String words[]=str.split(" ");
		System.out.println("Total words count in sentence :"+words.length);
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			char ch[]=word.toCharArray();
			System.out.println("Each word Character Count is :"+word+" : "+ch.length);
		}
	}

}
