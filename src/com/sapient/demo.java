package com.sapient;

class Parent {
	public void m1() {
		System.out.println("abc");
	}
	public void m2() {
		System.out.println("abc");
	}
	
}	
class Child extends Parent{
	public void m2() {
		System.out.println("def");
	}
	public void m3() {
		System.out.println("abc");
	}
}
class demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent onj=new Child();
		//onj.m3();
		
		Parent obj=new Parent();
		Child obj1=(Child)obj;
		obj1.m2();
	}

}
