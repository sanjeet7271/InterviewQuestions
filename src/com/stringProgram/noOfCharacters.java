package com.stringProgram;

public class noOfCharacters {
	static final int MAX_CHAR = 256;
	public static void noOfChars(String str) {
		int n=str.length();
		int[] count=new int[MAX_CHAR];
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
		}
		char ch[]=new char[n];
		for(int i=0;i<n;i++) {
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i) ==ch[j]) {
					find++;
				}
			}
			if (find == 1)  {
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]); 
			}
		}
}

	public static void main(String[] args) {
		String str = "geeksforgeeks"; 
		noOfChars(str); 

	}

}
