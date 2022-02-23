package collection;
import java.util.TreeSet;

//it shows output in ascending order(sorted order).

public class MyTreeSet {

	public static void main(String[] args) {

		TreeSet<String>tree=new TreeSet<String>();
		
        tree.add("Mj");
        tree.add("Aj");
        tree.add("Amit");
        tree.add("Dj");
        
        
        for(String s:tree) {
        	System.out.println(s);
        }
	}

}

