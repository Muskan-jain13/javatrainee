package assignment4;

import java.util.*;

class Employee1 {
	public int id;
	public String name;
	public String address;
	public Float sal;

	Employee1(int id, String name, String address, float sal) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}
//
//	public int getid() {
//		return id;
//	}
}

public class Ques5 {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		Employee1 e = new Employee1(23, "mj", "78 Model house", 49000);
		Employee1 e1 = new Employee1(27, "dj", "56 jyoti chowk", 48000);
		Employee1 e2 = new Employee1(25, "aj", "45 milap chowk", 47000);
		Employee1 e3 = new Employee1(24, "sj", "43 Model town", 75000);
		Employee1 e4 = new Employee1(29, "pj", "26 deol nagar", 65000);
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		// System.out.println(list);
		int searchid = 33;
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Employee1 emp = (Employee1) it.next();
			if (emp.id == searchid) {

				System.out.println("found");
				System.out.println(emp.name);
			}

		}

	}
}
