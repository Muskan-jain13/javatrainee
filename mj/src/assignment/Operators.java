//Arithmetic operator
package assignment;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;		
		int rem=10%20;
		
		System.out.println("Sum of and b    "  +sum);
		System.out.println("Subtraction of a and b   "  +sub);
		System.out.println("Multiplication of a and b   "  +mul);
		System.out.println("Division of a and b   "   +div);
		System.out.println("Modulus of a and b   "   +rem);
		
		
		
		
		
	//Assignment operator	
		int m=10;
		int n=78;
		int p=24;
		int x=8;
		int y=9;
		int z=2;
		int t=60;
		int v=5;
		
		m+=2;
		n-=2;
		p*=2;
		x/=2;
		y%=2;
		z&=2;
		t|=2;
		a^=2;
		
		
		System.out.println("value of m: " +m);
		System.out.println("value of n: " +n);
		System.out.println("value of p: " +p);
		System.out.println("value of x: " +x);
		System.out.println("value of y: " +y);
		System.out.println("value of z: " +z);
		System.out.println("value of t: " +t);
		System.out.println("value of v: " +v);
		
		
		
		
		//bitwise operator
		int s = 9, u = 8;   
		  
		System.out.println("x & y = " + (s & u)); 
		System.out.println("x | y = " + (s | u));
		System.out.println("x ^ y = " + (s ^ u));
		System.out.println("~x = " + ~(s));
		
		
		
		
		//logical operator
		 boolean e=false;
	        boolean f=true;
	        
	        
	        System.out.println("e||f =" +(e||f));
	        System.out.println("e&&f = " +(e&&f));
	        System.out.println("!(e||f) = " +!(e||f));
	        System.out.println("!(e&&f) = " +!(e&&f));
	        
	        int c,d,g,h;
	        c=10;
	        d=20;
	        g=30;
	        h=40;
	        
	       boolean result=(c>d)&&(g<h);
	       
	       
	       
	       //Relational operator
	       int j=50;
			int k=90;
			
			System.out.println("j>k: " +(j>k));
			System.out.println("j<k: " +(j<k));
			System.out.println("j>=k: " +(j>=k));
			System.out.println("j<=k: " +(j<=k));
			System.out.println("j!=k: " +(j!=k));
			System.out.println("j==k: " +(j==k));
			
			
			
			
			
			//Ternary operator
			int q, r;  
			q = 20;  
			r = (q == 1) ? 61: 90;  
			System.out.println("Value of y is: " +  y);  
			r = (q == 20) ? 61: 90;  
			System.out.println("Value of y is: " + y); 
			
			
			
			
			//Inc/Dec operator
			int o,w;

		     o = 10;
		     w= 70;

		     System.out.println("o: "+o);
		     System.out.println("w: "+w);
		     System.out.println("o: "+(--o));
		     System.out.println("w: "+(w--));
		     System.out.println("o: "+(++o));
		     System.out.println("w: "+(w++));
		     System.out.println("o: "+(o++));
		     System.out.println("o: "+(o--));
		     System.out.println("w: "+(--w));
		     System.out.println("w: "+(++w));

		
	}

}
