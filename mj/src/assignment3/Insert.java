package assignment3;
import java.util.Scanner;
public class Insert {

	public static void main(String[] args) {
		
		int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int t = sc.nextInt();
        System.out.println("enter the elements of the array");
        for(int i=0; i<t; i++)
        {
            a[i] = sc.nextInt();
        }
       
        for(int i=0; i<t; i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter the element that has to be inserted");
        int k = sc.nextInt();
        System.out.println("Enter the position where the element should be inserted");
        int pos = sc.nextInt();
        for(int i=t; i>pos; i--)
        {
            a[i] = a[i-1];
        }
        a[pos] = k;
        ++t;
        System.out.println("elements after insertion");
        for(int i=0;i<t;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
	}


