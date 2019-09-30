package com.NumberSystem;

/**
 * 
 * @author sanjeetpandit
 *Definition of Palindrome number or What is palindrome number?
	-A number is called palindrome number if it is remain same when its digits are reversed. For example 121 is palindrome number. When we will reverse its digit it will remain same number i.e. 121
	-Palindrome numbers examples: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191 etc. 
 *
 *
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		
		int min=1,max=150,r;
		for(int n=min;n<=max;n++) {
			int temp=n;
			int sum=0;
			while(temp!=0) {
				r=temp%10;
				sum=sum*10+r;
				temp=temp/10;
			}
			if(sum==n) {
				System.out.print(n+" ");
			}
		}

	}

}
