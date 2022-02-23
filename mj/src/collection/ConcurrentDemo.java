package collection;

import java.util.*;


import java.util.concurrent.*;



public class ConcurrentDemo {

	public static void main(String[] args) {
		//CopyOnWriteArraySet<String>list=new CopyOnWriteArraySet<>();
		 CopyOnWriteArrayList<String>list=new CopyOnWriteArrayList<>();
		//ArrayList<String>list=new ArrayList<String>();
		
		list.add("India");
		list.add("USA");
		list.add("UK");
//
//	
//        Iterator it=list.iterator();
//        
//        while(it.hasNext())
//        {
//        	list.add("canada");
//        	System.out.println(it.next());
//        	list.add("America");
//        	
//        }
//        while(it.hasNext())
//        {
//        	list.add("canada");
//        	System.out.println(it.next());
//        	list.add("america");
//        }
//}
//}
		for(String s:list) {
		System.out.println(s);
			list.add("america");
		}
		System.out.println("**************");
		for(String s:list) {
			System.out.println(s);
			list.add("america");
		}
        }
}
