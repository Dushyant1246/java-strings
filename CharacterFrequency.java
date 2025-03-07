// class CharacterFrequency to find and display the frequency of characters in a string
import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency and return as a 2D array
    public static char[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; // Array to store frequency of each ASCII character

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i; // Store character
                result[index][1] = (char) (frequency[i] + '0'); // Store frequency as char
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get character frequency
        char[][] charFrequencies = findCharacterFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (char[] pair : charFrequencies) {
            System.out.println(pair[0] + " -> " + (pair[1] - '0')); // Convert back to integer for display
        }

        scanner.close();
    }
}

/*
Enter a string: this is a string
Character frequencies:
  -> 3
a -> 1
g -> 1
h -> 1
i -> 3
n -> 1
r -> 1
s -> 3
t -> 2

*/