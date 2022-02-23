package assignment4;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Ques3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("see you");

		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
