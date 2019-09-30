package com.NumberSystem;

public class primNumber {

	public static void main(String[] args) {
		
		int n1=1, n2=100;
		for(int i=n1;i<=n2;i++) {
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(i!=1 && flag==0) {
				System.out.print(i+" ");
			}
		}

	}

}
