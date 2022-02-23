package oops;

class MethodOverloading {
	public void area(int side) {
		int result = side * side;
		System.out.println(" area of square   " + result);

	}

	public void area(int length, int breadth) {
		int result = length * breadth;
		System.out.println(" area of reactangle  " + result);
	}

	public void area(double pi, int r) {
		double result = pi * r * r;
		System.out.println(" area of circle  " + result);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.area(8);
		obj.area(8, 10);
		obj.area(3.14, 2);

	}
}
