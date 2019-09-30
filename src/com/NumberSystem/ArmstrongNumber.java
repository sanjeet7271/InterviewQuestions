package com.NumberSystem;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int min=1,max=300,r;
		for(int n=min;n<=max;n++) {
			int temp=n;
			int sum=0;
			while(temp!=0) {
				r=temp%10;
				sum=sum+(r*r*r);
				temp=temp/10;
			}
			if(sum==n) {
				System.out.print(n+" ");
			}
		}
	}

}
