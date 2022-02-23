package string;
import java.util.*;
public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringJoiner joinNames=new StringJoiner(",");
	
	joinNames.add("Rahul");
	joinNames.add("Raju");
	joinNames.add("Peter");
	joinNames.add("Raheem");
	System.out.println(joinNames);
	
	
	
	StringJoiner joinNames2=new StringJoiner(",","[","]");
	
	joinNames2.add("Rahul");
	joinNames2.add("Raju");
	joinNames2.add("Peter");
	joinNames2.add("Raheem");
	System.out.println(joinNames2);
	
	
	StringJoiner joinNames3=new StringJoiner(",","[","]");
	
	joinNames3.add("Rahul");
	joinNames3.add("Raju");
	
	StringJoiner joinNames4=new StringJoiner(":","#","#");
	joinNames4.add("Peter");
	joinNames4.add("Raheem");
	
	StringJoiner merge=joinNames3.merge(joinNames4);
	System.out.println(merge);

	}

}
