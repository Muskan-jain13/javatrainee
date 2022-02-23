package controlstatements;
import java.util.Scanner;
public class IfElse {
	public static void main(String[]args) {
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=in.nextInt();
		
		if(marks>=36) {
			System.out.println("Pass");
			}
		else {
			System.out.println("Fail");
		}
	}

}
