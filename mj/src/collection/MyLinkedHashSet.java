package collection;
import java.util.LinkedHashSet;

//gives output in the same order in which it is written.

public class MyLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String>lhs=new LinkedHashSet<String>();
		
		lhs.add("Two");
		lhs.add("Four");
		lhs.add("Three");
		
		for(String s:lhs) {
			System.out.println(s);
		}

	}

}
