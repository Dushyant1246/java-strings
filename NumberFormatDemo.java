// class NumberFormatDemo to demonstrate NumberFormatException
import java.util.Scanner;

class NumberFormatDemo{
	// Method to get integer from string to generate Exeption
	public static int stringToInteger (String string) {
		return Integer.parseInt(string);
	}
	
	// Method to get integer from string to generate and handle Exception
	public static int stringToIntegerHandled (String string) {
		int result = 0;
		try {
			result = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException caught: " + e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args) {
		// Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Take input from user for string
		System.out.print("Enter a number: ");	// welcome
		String string = scanner.nextLine();
		
		// Call method to generate IndexOutOfBoundsException
		int number = stringToInteger(string);
		
		scanner.close();	// close the scanner
	}
}