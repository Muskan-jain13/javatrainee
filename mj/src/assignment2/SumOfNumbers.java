package assignment2;

//write a java program to calculate the sum of numbers appear in a given string.

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String target = "it 15 is25 a 20string";
		char ch = '0';
		String temp = "0";
		int result = 0;
		for (int i = 0; i < target.length(); i++) {
			ch = target.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else {
				result = result + Integer.parseInt(temp);
				temp = "0";
			}
		}
		if (temp != "0") {
			result = result + Integer.parseInt(temp);
		}
		System.out.println(result);
	}

}
