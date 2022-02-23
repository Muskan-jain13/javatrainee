package array;

public class ArrayArgument {

	private static void printArray(Integer[] arr) {
		System.out.println("Array contents printed through method:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Integer[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80 };
		
		printArray(intArray); 
	}

}
