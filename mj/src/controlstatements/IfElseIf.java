package controlstatements;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter day between 0 to 4");
		int day=s.nextInt();
		if(day==0)
		{
			System.out.println("\n Sunday");
		}
		else if(day==1)
		{
			System.out.println("\n Monday");
		}
		else if(day==2)
		{
			System.out.println("\n Tuesday");
		}
		else if(day==3)
		{
			System.out.println("\n Wednesday");		
		}
		else if(day==4)
		{
			System.out.println("\n Thursday");
		}
		else
		{
			System.out.println("\n Wrong input");
		}
         
	}

}
