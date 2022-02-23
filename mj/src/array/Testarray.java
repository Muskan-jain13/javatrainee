package array;
import java.util.Scanner;

public class Testarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int m=sc.nextInt();
		int t[]=new int[m];
		
		for(int i=0;i<t.length;i++)
		{
			System.out.println("enter values");
			t[i]=sc.nextInt();
		}
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}

	}

}
