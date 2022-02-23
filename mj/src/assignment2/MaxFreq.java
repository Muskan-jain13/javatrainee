package assignment2;

import java.util.*;

//write a java program to find maximum occuring character in a string.

public class MaxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		char maxChar = str.charAt(0);
		int[] freq = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}
		max = freq[0];
		for (i = 0; i < freq.length; i++) {

			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}
		System.out.println("Maximum occurring character: " + maxChar);
	}

}
