// SplitText class to split the text into words and compare the result with the split() method
import java.util.Scanner;

class SplitText {
	
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");	// hello this is a line from user
        String userInput = scanner.nextLine();

        // Splitting words using custom method and built-in method
        String[] wordsUsingCustomMethod = splitWords(userInput);
        String[] wordsUsingBuiltInMethod = userInput.split(" ");

        // Comparing both results
        boolean isSame = compareStringArrays(wordsUsingCustomMethod, wordsUsingBuiltInMethod);

        // Displaying results
        System.out.println("Are both results same? " + isSame);	// true

        scanner.close(); // Closing the scanner object
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count); // Access characters until an exception occurs
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when accessing an index out of range, return the count
        }
        return count;
    }

    // Method to split a string into words using charAt() without using split()
    public static String[] splitWords(String input) {
        int length = getStringLength(input);
        int spaceCount = 0;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1]; // Words array
        int wordIndex = 0, start = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                words[wordIndex++] = input.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = input.substring(start, length);
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
