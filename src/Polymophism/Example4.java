package Polymophism;
class A1{
	void show() {
		System.out.println("Class A");
	}
}
class B1 extends A1{
	protected void show() {
		System.out.println("Class B");
	}
}
public class Example4 {

	public static void main(String[] args) {
		
		A1 obj=new B1();
		obj.show();
		

	}

}
