// SplitTextLength class to split the text into words and return the words along with their lengths in a 2D array
import java.util.Scanner;

class SplitTextLength {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Splitting words and getting their lengths
        String[] words = splitWords(userInput);
        String[][] wordWithLengths = getWordsWithLength(words);

        // Displaying results
        displayWordLengths(wordWithLengths);

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

    // Method to return a 2D array of words along with their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store word
            result[i][1] = String.valueOf(getStringLength(words[i])); // Store length as String
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayWordLengths(String[][] wordData) {
        System.out.println("Word\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
