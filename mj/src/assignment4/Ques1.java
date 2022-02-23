package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques1 {

	private ArrayList<Integer> list;

	public ArrayList<Integer> saveEvenNumbers(int N) {
		list = new ArrayList<>();
		for (int i = 1; i <=N; i++) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}

	public ArrayList<Integer> printEvenNumbers(int N) {
		if (list.contains(N)) {
			System.out.println("The number is:" + N);
		} else {
			System.out.println("0");
		}
		return list;
	}

	public static void main(String[] args) {
		Ques1 a = new Ques1();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int n = sc.nextInt();
		a.saveEvenNumbers(n);
		a.printEvenNumbers();
		a.printEvenNumbers(20);
	}

}
