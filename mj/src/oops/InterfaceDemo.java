package oops;

interface i1 {
	public static void show() {
		System.out.println("show method");
	}

	public default void show1() {
		System.out.println("show method 1");
	}
}

public class InterfaceDemo implements i1 {

	public static void main(String[] args) {
		i1 i = new InterfaceDemo();
		i1.show(); //call by interface
		i.show1(); //call by object

	}

}
