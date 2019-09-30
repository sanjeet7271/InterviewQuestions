package com.sapient;

public class Counter {
	static int count;
	public Counter() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter C1=new Counter();
		Counter C2=new Counter();
		Counter C3=new Counter();
	}

}
