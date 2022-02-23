package assignment4;

import java.util.Vector;
import java.util.Scanner;

public class Ques7 {

	private Vector<Integer> list;

	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<>();
		for (int i = 1; i <= N; i++) {
			
				list.add(2*i);
			}

		return list;
	}

	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newList = new Vector<>();
		for (int item : list) {
			newList.add(item * 2);
			
		}
		System.out.println(newList);
		return newList;
	}

	public Vector<Integer> printEvenNumbers(int N) {
		if (list.contains(N)) {
			System.out.println("The number is:" + N);
		} else {
			System.out.println("0");
		}
		return list;
	}

	public static void main(String[] args) {
		Ques7 a = new Ques7();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int n = sc.nextInt();
		a.saveEvenNumbers(n);
		a.printEvenNumbers();
		a.printEvenNumbers(4);

	}

}
