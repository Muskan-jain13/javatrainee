package oops;

class Student1 {

	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Student1(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
 class TestStaticMethod {
	public static void main(String args[]) {
		Student1.change();// calling change method

		// creating objects
		Student1 s1 = new Student1(111, "Karan");
	
	
		// calling display method
		s1.display();
		
		
	}

}

