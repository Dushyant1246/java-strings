// class StringUpper to convert string to uppercase
import java.util.Scanner;

class StringUpper{
	
	// Method to conver string to all uppercase using charAt()
	public static String stringToUpper(String string) {
		String result = "";
		for (int i = 0 ; i < string.length() ; i++) {
			int charASCII = ((int) string.charAt(i));
			if (charASCII >=97 && charASCII <= 122) {	// if character is lowercase convert to uppercase
				result += (char) (charASCII - 32);
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
		
		// Find uppercase string using built-in and custom method
		String builtinUpperString = string.toUpperCase();
		String customUpperString = stringToUpper(string);
		
		// Display both string and thier comparison
		System.out.println("Built-in upper case string: " + builtinUpperString);	// WELCOME
		System.out.println("Custom upper case string: " + customUpperString);		// WELCOME
		System.out.println("Are both string equal? " + isStringEqual(builtinUpperString, customUpperString)); // true
		
	}
}