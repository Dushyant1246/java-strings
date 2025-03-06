// class ArrayExceptionDemo to demonstrate ArrayIndexOutOfBoundsException
import java.util.Scanner;

class ArrayExceptionDemo{
	// Method to access element from array to generate Exeption
	public static int getElement (int[] array, int i) {
		return array[i];
	}
	
	// Method to access element from array to generate and handle Exeption
	public static int getElementHandled (int[] array, int i) {
		int result = 0;
		try {
			result = array[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args) {
		// Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Take input from user for string
		System.out.print("Enter length and array elements: ");	// 5 1 2 3 4 5
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0 ; i < length ; i++) {
			array[i] = scanner.nextInt();
		}
		
		// Call method generate and handle IndexOutOfBoundsException
		int number = getElementHandled(array, length);
		
		scanner.close();	// close the scanner
	}
}