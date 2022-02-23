package assignment2;

//write a java program to count how many times the substring 'life' present at anywhere in a string.

public class CountDemo {

	public static void main(String[] args) {

		String str = "liveonwildlife";
		System.out.println("String :" + str);
		int subStrCount = 0;
		String substr = "life";
		int index = 0;
		while ((index = str.indexOf(substr, index)) >= 0) {
			subStrCount++;
			index = index + substr.length();
		}
		System.out.println("Substring" + substr + "found" + subStrCount + "times!");
	}
	
}
