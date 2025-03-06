// TrimSpaces class to trim leading and trailing spaces from a string using charAt()
import java.util.Scanner;

class TrimSpaces {
	
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string with spaces: ");	// "  hello  "
        String userInput = scanner.nextLine();

        // Trimming spaces using custom and built-in method
        String customTrimmedString = trimString(userInput);
		String builtinTrimmedString = userInput.trim();
        System.out.println("Trimmed String: " + customTrimmedString);	// hello
        System.out.println("Built-in Trim: " + builtinTrimmedString);	// hello
		System.out.println("Are both strings equal? " + isStringEqual(customTrimmedString, builtinTrimmedString));

        scanner.close(); // Closing the scanner object
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

    // Method to find the start and end indexes of non-space characters
    public static int[] findTrimIndexes(String input) {
        int start = 0, end = 0;
        int length = 0;
        
        // Finding the length of the string without using length()
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Stop counting when an exception occurs
        }

        // Finding the first non-space character index
        while (start < length && input.charAt(start) == ' ') {
            start++;
        }
        
        // Finding the last non-space character index
        end = length - 1;
        while (end > start && input.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }

    // Method to extract trimmed substring using charAt()
    public static String trimString(String input) {
        int[] indexes = findTrimIndexes(input);
        StringBuilder trimmed = new StringBuilder();
        
        for (int i = indexes[0]; i <= indexes[1]; i++) {
            trimmed.append(input.charAt(i));
        }
        return trimmed.toString();
    }

}
