package string;
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome in Edubridge academy";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
