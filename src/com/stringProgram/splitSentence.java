package com.stringProgram;

public class splitSentence {

	public static void main(String[] args) {
		//1.) print each word from sentence and count no of words
		String str="Hello My Name is sanjeet and I am from INDIA";
		String[] words=str.split(" ");
		System.out.println("total no of words are :"+words.length);
		System.out.println("After split words are following :");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		//2.)remove all space from sentence
		String removeSpace=str.replaceAll(" ", "");
		System.out.print("Sentence without spaces :"+removeSpace);	
		System.out.println();
		
		//3.) remove all space from sentence without using replaceAll
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\t') {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);

	}

}
