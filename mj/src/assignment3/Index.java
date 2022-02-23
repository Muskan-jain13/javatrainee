package assignment3;
import java.util.*;

public class Index {

	public static int findIndex(int arr[],int m)
	{
		if(arr==null)
		{
			return -1;
		}
		int length=arr.length;
		int i=0;
		while(i<length)
		{
			if(arr[i]==m)
			{
				return i;
			}
			else
			{
				i=i+1;
			}
		}

	return -1;
}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int m=sc.nextInt();
		int a[] = new int[m];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter values");
			a[i]=sc.nextInt();
		}
		
		 System.out.println("Index position of m is: "
                 + findIndex(a,m));
	}
}
