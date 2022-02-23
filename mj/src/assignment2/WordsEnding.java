package assignment2;

import java.util.*;

//write a java program to count the number of words ending in 'm' or 'n' in a given text.

public class WordsEnding {
	
	public int endWithmorn(String str) {
		int l = str.length();
		int ctr = 0;
		String s = str.toLowerCase();
		for (int i = 0; i < l; i++) {
			if (str.charAt(i) == 'm' || str.charAt(i) == 'n') {
				if (i < l - 1 && !Character.isLetter(str.charAt(i + 1)))
					ctr++;
				else if (i == l - 1)
					ctr++;
			}
		}
		return ctr;
	}
public static void main (String[] args)
{
	
   WordsEnding m= new WordsEnding();
  String str1 =  "my name is muskan";
  System.out.println("The given string is: "+str1);
  System.out.println("The number of words ends eith m or n is: "+m.endWithmorn(str1));
  
  }
}
