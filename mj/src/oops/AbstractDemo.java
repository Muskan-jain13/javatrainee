package oops;
abstract class Bike{
	abstract void run();
		
	}
 class AbstractDemo extends Bike {
	 void run() {
	 System.out.println("running safely");
	 }

	public static void main(String[] args) {
		Bike obj=new AbstractDemo();
		obj.run();
		

	}

}
