package com.Inheritance;
/**
 * Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object
 * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
 *  
 */

class parent {
	public void printA() {
		System.out.println("Print A");
	}
}
class Child extends parent {
		public void printB() {
			System.out.println("Print B");
		}
}
class SingleInheritance{
	public static void main(String[] args) {
		Child c=new Child();
		c.printA();
		c.printB();

	}

}
