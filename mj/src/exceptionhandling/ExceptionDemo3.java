package exceptionhandling;

//Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero.  


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();

		int[] arr = new int[n];
			

		System.out.println("Enter the elements in the array ");

		try {

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			System.out.println("Enter the index of the array element you want to access");

			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("java.lang.ArrayIndexOutOfBoundsException");

		} catch (InputMismatchException e) {

			System.out.println("java.util.InputMismatchException");

		}

		sc.close();

	}

}
