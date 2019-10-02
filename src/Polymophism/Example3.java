package Polymophism;

class E{
	void show() {
		System.out.println("Class E");
	}
	void display() {
		System.out.println("Class Display");
	}
}
class F extends E{
	void show() {
		System.out.println("Class F");
	}
	void Run() {
		System.out.println("Class Run");
	}
}
public class Example3 {

	public static void main(String[] args) {
		
		E obj=new F();
		obj.show();
		obj.display();
		
		F obj1=new F();
		obj1.show();
		obj1.Run();
		

	}

}
