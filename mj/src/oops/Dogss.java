package oops;

class Animalss {
	public Animalss() {
		System.out.println("this is animal class");
	}

	public Animalss(int a) {
		System.out.println("this is animal constructo" + a);
	}

	public void run() {
		System.out.println("animal is running");
	}

}

class Dogss extends Animalss {
	public Dogss(int x, int y) {
		super(20);
		System.out.println(x + "this is dog constructor" + y);
	}

	public void run() {
		super.run();
		System.out.println("dog is running");
	}

	public static void main(String[] args) {
		Dogss d = new Dogss(20, 30);
		d.run();

	}

}
