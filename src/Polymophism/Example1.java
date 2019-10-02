package Polymophism;
class A{
	void show() {
		System.out.println("Class A");
	}
}
class B extends A{
	
}
public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();

	}

}
