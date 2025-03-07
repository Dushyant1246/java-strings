// class NonRepeatingCharacter to find the first non-repeating character in the string
import java.util.Scanner;

public class NonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256]; // Array to store character frequencies
        
        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; // Increment frequency of character
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i); // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no unique character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Finding first non-repeating character
        char result = findFirstNonRepeatingChar(input);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found.");
        }

        scanner.close();
    }
}

/*
Enter a string: sample string
First non-repeating character: a
*/