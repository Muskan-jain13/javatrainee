package assignment;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,rev=0,number=10509;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("rev :" +rev);
	}
}
