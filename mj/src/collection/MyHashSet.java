package collection;
import java.util.*;

//it does not guarantee order of elements.

public class MyHashSet {

	public static void main(String[] args) {
		Set<Integer > hash=new HashSet<Integer>();
		
		hash.add(2);
		hash.add(43);
		hash.add(1);
		hash.add(10);
		hash.add(20);
		hash.add(21);
		hash.add(18);
		
		Iterator itr=hash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
