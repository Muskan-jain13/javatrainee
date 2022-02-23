package collection;
import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
	     Map<String,String>map =new HashMap<String,String>();
         map.put("India","Delhi");
         map.put("USA", "Washington");
         map.put("Japan", "Tokiyo");
         map.put("China", "Beijing");
         
         System.out.println(map);
         System.out.println(map.get("India"));
         System.out.println(map.keySet());
         System.out.println(map.values());
         System.out.println(map.containsKey("Japan"));
         System.out.println(map.containsValue("Delhi"));
         map.replace("India","Mumbai");
         System.out.println(map.get("India"));
         Set s=map.entrySet();
         Iterator it=s.iterator();
         while(it.hasNext())
         {
        	 Map.Entry me=(Map.Entry)it.next();
        	 System.out.println(me.getKey()+" "+me.getValue());
         }
	}

}
