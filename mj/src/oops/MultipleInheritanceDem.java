package oops;


interface Test5 {
	final int d = 22;

	abstract public int area();

	abstract public int volume();
}

interface Test6 {
	final int d = 25;

	public int area2();
}

class Z {
	public void input()

	{
		System.out.println("This is an input method ");

	}

	public void output()

	{
		System.out.println("This is an output method");

	}
}

class Cprog extends Z implements Test6, Test5 {
	int i, j;

	public int area() {
		i = 10;
		j = 20;
		return i * j;
	}

	public int volume() {
		return (i * j * 22);
	}

	public int area2()

	{
		System.out.println("Area 2 is a method of Test2 interface");
		return i * j;

	}
}

class MultipleInheritanceDem {
	public static void main(String args[]) {
		Cprog obj = new Cprog();
		obj.input();
		obj.output();
		obj.area();
		obj.volume();
		obj.area2();
	}
}
