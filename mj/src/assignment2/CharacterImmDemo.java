package assignment2;

import java.util.*;

//write a java program to check whether the character immediately before and after a specified character is same in a given string

public class CharacterImmDemo {

	public boolean leftAndRightSame(String str) {

		int l = str.length();
		boolean found = true;
		for (int i = 0; i < l - 1; i++) {
			String tmpString = str.substring(i, i + 1);
			if (tmpString.equals("#") && i > 0 && i < l) {
				if (str.charAt(i - 1) == str.charAt(i + 1))
					found = true;
				else
					found = false;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		CharacterImmDemo t = new CharacterImmDemo();
		String str1 = "moon#night";
		String str2 = "bat##ball";
		String str3 = "#moon#night";
		System.out.println("The given string is: " + str1);
		System.out.println("The before and after character are same: " + t.leftAndRightSame(str1));
		System.out.println("The given string is: " + str2);
		System.out.println("The before and after character are same: " + t.leftAndRightSame(str2));
		System.out.println("The given string is: " + str3);
		System.out.println("The before and after character are same: " + t.leftAndRightSame(str3));
	}
}
