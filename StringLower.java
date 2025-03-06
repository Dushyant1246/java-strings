// class StringLower to convert string to lowercase
import java.util.Scanner;

class StringLower{
	
	// Method to conver string to all lowercase using charAt()
	public static String stringToLower(String string) {
		String result = "";
		for (int i = 0 ; i < string.length() ; i++) {
			int charASCII = ((int) string.charAt(i));
			if (charASCII >=65 && charASCII <= 90) {	// if character is uppercase convert to lowercase
				result += (char) (charASCII + 32);
			} else {
				result += string.charAt(i);
			}
		}
		return result;
	}
	
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
		
		// Take user input for string
		System.out.print("Enter a string: ");	// Welcome
		String string = scanner.nextLine();
		
		// Find lowercase string using built-in and custom method
		String builtinLowerString = string.toLowerCase();
		String customLowerString = stringToLower(string);
		
		// Display both string and thier comparison
		System.out.println("Built-in lower case string: " + builtinLowerString);	// welcome
		System.out.println("Custom lower case string: " + customLowerString);		// welcome
		System.out.println("Are both string equal? " + isStringEqual(builtinLowerString, customLowerString)); // true
		
	}
}