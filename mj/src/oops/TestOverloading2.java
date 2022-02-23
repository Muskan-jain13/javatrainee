package oops;
class Add{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}
public class TestOverloading2 {
	public static void main(String[] args) {
		System.out.println(Add.add(30, 40));
		System.out.println(Add.add(1.2, 3.4));
		

	}

}
