package com.pattern;

public class floyed {

	public static void main(String[] args) {
		int num=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
