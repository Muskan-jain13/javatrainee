package exceptionhandling;

class MyOwnException extends Exception {
	public MyOwnException(String msg) {
		super(msg);
	}
}

class EmployeeTest {
	static void employeeAge(int age) throws MyOwnException {
		if (age < 0) {
			MyOwnException obj = new MyOwnException("Age can't be less than zero");
			throw obj;
			
		} else {
			System.out.println("Input is valid!!");
		}
	}

	public static void main(String[] args) {
		try {
			employeeAge(-2);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
	}
}
