package string;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		for(char ch='a';ch<='z';ch++)
		{
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					c++;
				}
			}
			if(c!=0)
			System.out.println(ch + "\t" + c);
		}

	}

}
