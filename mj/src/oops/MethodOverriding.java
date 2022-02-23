package oops;
class Animal{
	public void move()
	{
		System.out.println("Animals can walk");
	}
}
class Dog extends Animal{
	public void move()
	{
		System.out.println("Dogs can walk");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.move();

	}

}
