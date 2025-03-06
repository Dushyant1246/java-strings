// class StringSubstring to get substring from a string
import java.util.Scanner;

class StringSubstring{
	
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
	
	// Method to get substring from a string
	public static String getSubstring(String string, int start, int end){
		String result = "";
		for (int i = start ; i < end ; i++) {
			result += string.charAt(i);
		}
		return result;
	}
	
	public static void main (String[] args) {
		// Scanner object to take input from user
		Scanner scanner = new Scanner(System.in);
		
		// Take input from user for a string and starting ending point of substring
		System.out.print("Enter a string: ");	// hello everyone
		String string = scanner.nextLine();	
		System.out.print("Enter starting and ending point of substring: ");	// 3 9
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		// Find substring using built-in and custom method
		String builtinSubstring = string.substring(start, end);
		String customSubstring = getSubstring(string, start, end);
		
		// Display both substring and thier comparison
		System.out.println("Built-in Substring: " + builtinSubstring);
		System.out.println("Custom Substring: " + customSubstring);
		System.out.println("Are both substring equal? " + isStringEqual(builtinSubstring, customSubstring));
	}
}