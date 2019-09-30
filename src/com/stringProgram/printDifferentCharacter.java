package com.stringProgram;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 	 1.) print duplicate character
 	 2.) Print duplicate characters excluding white space
 	 
 *
 */
public class printDifferentCharacter {

	public static void main(String[] args) {

		String str = "Hello India I Love You";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);				
			} else {
				map.put(c, 1);
			}
		}
		// 1.) print duplicate character
		System.out.println("Duplicate characters :");
		for (char c : map.keySet()) {
			if (map.get(c) > 0) {
				System.out.println("Char :" + c + " occurs " + map.get(c) + " times");
			}
		}
		
		//2.) Print duplicate characters excluding white space
		System.out.println("Duplicate characters excluding white space :");
		for (char c : map.keySet()) {
			if (map.get(c) > 1 && !Character.isWhitespace(c)) {
				System.out.println(c);
			}
		}

		//3.) Print distinct characters
		System.out.println("Distinct characters:");
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				System.out.println(c);

			}
		}
	
		//4.) Print 1st non repeating character
		System.out.println("1st non repeated character:");
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}

}
