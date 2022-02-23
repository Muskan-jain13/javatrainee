package mj;
import java.util.Scanner;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int i, j, temp;
	        System.out.println("All Prime Numbers Between 1 to 100");
	 
	        for (i = 2; i <= 100; i++) {
	        	 temp=0;
	            
	            for (j = 2; j <= i-1; j++) {
	                
	                if (i % j == 0) {
	                    temp=temp+1;
	                }
	            }
	 
	            if (temp == 0) {
	                System.out.print(i + " ");
	        }
	            
	}

}
}
