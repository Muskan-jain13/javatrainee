package exceptionhandling;

// Write a Program with a division method who receives two integer numbers and performs the division operation. The method should declare that it throws ArithmeticException.

import java.util.*;

public class ExceptionDemo5 {
	static void division() throws ArithmeticException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the two numbers you want to divide");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a / b;
		System.out.println("The answer is " + c);
		s.close();
	}

	public static void main(String args[]) {
		try {
			division();

		} catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}

	}
}
