package array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int sum = 0;
		int m = sc.nextInt();
		int a[] = new int[m];
		System.out.println("enter values");

		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();

		}

		for (int i : a) {

			sum += i;
		}
		System.out.println("sum is" + sum);

	}

}
