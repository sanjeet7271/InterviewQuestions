package nullPointerException;

public class StaticvsNonstaticMethods {

	public static void main(String[] args) {
		StaticvsNonstaticMethods obj=null;
		obj.Test();
		obj.Test1();

	}
	private static void Test() {
		System.out.println("called static methods");
	}
	private void Test1() {
		System.out.println("called non-static methods");
		System.out.println("called non-static methods");
	}
}
