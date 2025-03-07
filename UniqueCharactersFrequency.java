// class UniqueCharacterFrequency to find and display the frequency using unique charcters
import java.util.Scanner;

public class UniqueCharacterFrequency {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get character frequency
        String[][] charFrequencies = findCharacterFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (String[] pair : charFrequencies) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }

        scanner.close();
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with exact unique count
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find frequency of unique characters
    public static String[][] findCharacterFrequency(String str) {
        char[] uniqueChars = findUniqueCharacters(str);
        int[] frequency = new int[uniqueChars.length];

        // Count frequency of each unique character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < uniqueChars.length; j++) {
                if (uniqueChars[j] == ch) {
                    frequency[j]++;
                    break;
                }
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Store character
            result[i][1] = String.valueOf(frequency[i]);    // Store frequency
        }

        return result;
    }

}
/*
Enter a string: hello everyone this is a string
Character frequencies:
h -> 2
e -> 4
l -> 2
o -> 2
  -> 5
v -> 1
r -> 2
y -> 1
n -> 2
t -> 2
i -> 3
s -> 3
a -> 1
g -> 1

*/