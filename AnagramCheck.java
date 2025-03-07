// AnagramCheck to check of the two strings are anagrams or not
import java.util.Scanner;

public class AnagramCheck {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        // Checking for anagram
        boolean result = areAnagrams(text1, text2);

        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if the lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays for characters (assuming ASCII 256 characters)
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Step 3: Count character frequencies in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }
}

/*
Enter first text: strain
Enter second text: trains
The texts are anagrams.

*/