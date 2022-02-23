package exceptionhandling;

// Write a class MathOperation which accepts integers from command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements. 

import java.util.*;

public class ExceptionDemo4 {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException, InputMismatchException {

		int[] array = new int[args.length];
		try {
			int sum = 0;
			for (int i = 0; i < args.length; i++) {
				if (args[i].charAt(args[i].length() - 1)==',')
					array[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
				else
					array[i] = Integer.parseInt(args[i]);
				sum += array[i];
			}
			int avg = sum / args.length;
			System.out.println("Sum of array is: " + sum + " and average is :" + avg);
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception occured" + e);
		} catch (NumberFormatException e) {
			System.out.println("number format exception occured" + e);
		}

	}
}