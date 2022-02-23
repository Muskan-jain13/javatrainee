package controlstatements;
import java.util.Scanner;

public class If {
	public static void main(String[]args) {
		int marks;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=in.nextInt();
		
		if(marks>=33) {
			System.out.println("Pass");
		}
	}
	

}
