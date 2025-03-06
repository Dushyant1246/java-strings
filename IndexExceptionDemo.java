// class IndexExceptionDemo to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;

class IndexExceptionDemo{
	// Method to generate Exeption
	public static void generateIndexOutOfBoundsException (String string) {
		char stringCharacter = string.charAt(string.length());
	}
	
	// Method to generate and handle Exception
	public static void handleIndexOutOfBoundsException (String string) {
		try {
			char stringCharacter = string.charAt(string.length());
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException caught: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Take input from user for string
		System.out.print("Enter a string: ");	// welcome
		String string = scanner.nextLine();
		
		// Call method to generate and handle IndexOutOfBoundsException
		handleIndexOutOfBoundsException(string);
	}
}