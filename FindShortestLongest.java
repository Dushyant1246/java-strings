// FindShortestLongest class to split the text into words and find the shortest and longest strings in a given text
import java.util.Scanner;

class FindShortestLongest {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");	// hello this is a line from user
        String userInput = scanner.nextLine();

        // Splitting words and getting their lengths
        String[] words = splitWords(userInput);
        String[][] wordWithLengths = getWordsWithLength(words);

        // Finding shortest and longest words
        int[] indexes = findShortestLongest(wordWithLengths);

        // Displaying results
        displayShortestAndLongest(wordWithLengths, indexes);	// Shortest Word : a (length: 1) Longest Word : hello (length: 5)

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

    // Method to find the shortest and longest word
    public static int[] findShortestLongest(String[][] wordData) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.parseInt(wordData[0][1]);
        int longestLength = Integer.parseInt(wordData[0][1]);

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);

            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex}; // Return indexes of shortest and longest words
    }

    // Method to display the shortest and longest words
    public static void displayShortestAndLongest(String[][] wordData, int[] indexes) {
        System.out.println("Shortest Word: " + wordData[indexes[0]][0] + " (Length: " + wordData[indexes[0]][1] + ")");
        System.out.println("Longest Word: " + wordData[indexes[1]][0] + " (Length: " + wordData[indexes[1]][1] + ")");
    }

}
