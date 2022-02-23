package oops;

class Animals{
	
	public void move()
	{
		
		System.out.println("Animals can walk");
	}
}
class Dogsss extends Animals{
	
	public void move()
	{
		
	   super.move();
		System.out.println("Dogs can walk and run");
	}
}

	



public class Super {

	public static void main(String[] args) {
		Dogsss d=new Dogsss();
		d.move();

	}

}
