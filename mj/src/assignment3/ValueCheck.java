package assignment3;

import java.util.Scanner;
import java.util.*;

public class ValueCheck {

	public static void pos(int arr[], int value) {
		boolean pos1 = false;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				pos1 = true;
				break;
			}
		}
		System.out.println(value + "is present" + pos1);
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("Enter the elements to search");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int j = 0; j < size; j++) {
			arr[j] = sc.nextInt();
		}
		int value = sc.nextInt();
		System.out.println("Array:" + Arrays.toString(arr));
		pos(arr, value);

	}

}
