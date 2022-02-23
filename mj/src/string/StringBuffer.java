package string;
import java.util.Scanner;
import java.io.*;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter your name");
		try
		{
			String name=br.readLine();
			System.out.println("Name is"+name);
		}
		catch(IOException e)
		{
		    System.out.println("Exception is occured"+e);
		}
	}

}
