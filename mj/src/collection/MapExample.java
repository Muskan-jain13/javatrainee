package collection;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String>fruit=new HashMap<String,String>();
		fruit.put("Apple", "Red");
		fruit.put("Mango", "yellow");
		fruit.put("Guava", "Green");
		
		for(String key:fruit.keySet()) {
			System.out.println(key +":"  +fruit.get(key));
			
		}		

	}

}
