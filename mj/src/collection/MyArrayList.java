package collection;
import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>al =new ArrayList<String>();
		 al.add("D");
		 al.add("A");
		 al.add("Z");
		 al.add("T");
		 al.add(String.valueOf(23));
		 
		 System.out.println(al);
		 System.out.println(al.get(0));
		 System.out.println(al.get(2));
		 System.out.println(al.get(1));
		 System.out.println(al.get(3));
		 System.out.println(al.get(4));

	}

}
