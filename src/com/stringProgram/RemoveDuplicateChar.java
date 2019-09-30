package com.stringProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sanjeet";
		Set<Character> setChar=new HashSet<Character>();
		StringBuffer sb=new StringBuffer();
			for(int j=0;j<str.length();j++) {
				Character c=str.charAt(j);
				if(!setChar.contains(c)) {
					setChar.add(c);
					sb.append(c);
				}
				
			}
			System.out.println(sb);
	}

}
