// class StringCompare to compare two strings
import java.util.Scanner;

class StringCompare{
	// Method to compare strings using charAt()
	public static boolean isStringEqual (String string1, String string2) {
		if (string1.length() == string2.length()) {
			for (int i = 0 ; i < string1.length() ; i++) {
				if (string1.charAt(i) != string2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main (String[] args) {
		// Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Take user input for 2 strings
		System.out.print("Enter a string: ");
		String string1 = scanner.nextLine();
		System.out.print("Enter another string: ");
		String string2 = scanner.nextLine();
		
		// Compare string using built-in and custom method and print the result
		System.out.println("Result of comparing strings using custom method: " + isStringEqual(string1, string2));	
		System.out.println("Result of comparing strings using built-in method: " + string1.equals(string2));	
		
	}
}