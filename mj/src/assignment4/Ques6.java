package assignment4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ques6 {

	private LinkedList<Integer> list;

	public LinkedList<Integer> saveEvenNumbers(int N) {
		list = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			
				list.add(2*i);
			}
		
		return list;
	}

	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> newList = new LinkedList<>();
		for (int item : list) {
			newList.add(item * 2);
			
		}
		System.out.println(newList);
		return newList;
	}

	public LinkedList<Integer> printEvenNumbers(int N) {
		if (list.contains(N)) {
			System.out.println("The number is:" + N);
		} else {
			System.out.println("0");
		}
		return list;
	}

	public static void main(String[] args) {
		Ques6 a = new Ques6();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int n = sc.nextInt();
		a.saveEvenNumbers(n);
		a.printEvenNumbers();
		a.printEvenNumbers(4);

	}

}
