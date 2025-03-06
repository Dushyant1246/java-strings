// class IllegalArgumentDemo to demonstrate IllegalArgumentException
import java.util.Scanner;

class IllegalArgumentDemo{
	// Method to get substring to generate Exeption
	public static String getSubstring (String string, int start, int end) {
		if (start > end) {
			throw new IllegalArgumentException("Starting index cannot be greater then ending index");
		}
		return string.substring(start, end);
	}
	
	// Method to get substring to generate and handle Exception
	public static String getSubstringHandled (String string, int start, int end) {
		String result = "";
		try {
			if (start > end) {
				throw new IllegalArgumentException("Starting index cannot be greater then ending index");
			}
			result = string.substring(start, end);
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException caught: " + e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args) {
		// Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Take input from user for string
		System.out.print("Enter a string: ");	// welcome
		String string = scanner.nextLine();
		
		// Call method to generate IndexOutOfBoundsException
		String substr = getSubstring(string, 6, 3);
		
		scanner.close();	// close the scanner
	}
}