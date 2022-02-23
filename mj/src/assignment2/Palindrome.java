package assignment2;

import java.util.Scanner;

//write a program to check string is palindrome or not.

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		a = s.nextLine();
		int n = a.length();

		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
