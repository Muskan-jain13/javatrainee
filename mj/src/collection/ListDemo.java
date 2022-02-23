package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
        list.add(new String("Vijay"));
        list.add("Aman");
        list.add("Rajat");
  //      list.add(1);
//        list.add(true);
//       list.add(4);
//       list.add(2);
 // also shows duplicacy.
        
        
        
        Collections.sort(list);
        
//1.using simple for loop        
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
        System.out.println(list);





	
	
	
//2.using iterator        
	    Iterator itr=list.iterator();
	    while(itr.hasNext()) {
	    System.out.println(itr.next());
	    
	    }
	    
	    
	    
	    
	    
//3.using for each loop	    
	    for(String s:list) {
	    	System.out.println(s);
	    }
	    
	    
	    
	    

	    
//4.using lambda expressions	    
	    list.stream().forEach(e->System.out.println());
}
}

	    
	    
