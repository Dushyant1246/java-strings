// class CharacterArray to convert string to an array of characters
import java.util.Scanner;

class CharacterArray{
	// Method to convert string to an array
	public static char[] stringToArray(String string){
		char[] result = new char[string.length()];
		for (int i = 0 ; i < string.length() ; i++) {
			result[i] = string.charAt(i);
		}
		return result;
	}
	// Method to compare string array
	public static boolean isCharArrayEqual (char[] string1, char[] string2) {
		if (string1.length == string2.length) {
			for (int i = 0 ; i < string1.length ; i++) {
				if (string1[i] != string2[i]) {
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
		System.out.print("Enter a string: ");	// hello welcome
		String string = scanner.nextLine();
		
		// Convert the string with custom and built-in method to a char array and store in variable
		char[] customStringArray = stringToArray(string);
		char[] builtinStringArray = string.toCharArray();
		
		// Check if both char arrays are equal
		System.out.println("Are custom and built-in arrays equal? " + isCharArrayEqual(customStringArray, builtinStringArray));	// true
		
	}
}