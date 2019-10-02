package com.Inheritance;

class GrandParent{
	void printA() {
		System.out.println("Print A");
	}
}
class parent extends GrandParent{
	void printB() {
		System.out.println("Print B");
	}
}
class child extends parent{
	public void printC() {
		System.out.println("Print C");
	}
}
class multipleInheritance {
	public static void main(String[] args) {
		parent p=new parent();
		p.printA();
		p.printB();
		child c=new child();
		c.printA();
		c.printB();
		c.printC();
	}

}
