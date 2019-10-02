package Polymophism;

class C{
	void show() {
		System.out.println("Class A");
	}
}
class D extends C{
	void show() {
		System.out.println("Class B");
	}
}
class Example2 {

	public static void main(String[] args) {
		D obj=new D();
		obj.show();

	}

}
