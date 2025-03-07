// class CharacterFrequencyNestedLoops to find character frequency using nested loops
import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get character frequencies
        String[] frequencies = findCharacterFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }

    // Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        int length = charArray.length;
        int[] frequency = new int[length]; // Array to store frequencies

        // Initialize all frequencies to -1 (unprocessed)
        for (int i = 0; i < length; i++) {
            frequency[i] = -1;
        }

        // Find character frequencies using nested loops
        for (int i = 0; i < length; i++) {
            if (frequency[i] == 0) continue; // Skip already counted characters

            int count = 1; // Initialize frequency count
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    frequency[j] = 0; // Mark duplicate characters to avoid re-counting
                }
            }
            frequency[i] = count; // Store final frequency for the character
        }

        // Count unique characters to create result array
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store result in a 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (frequency[i] > 0) {
                result[index] = charArray[i] + " -> " + frequency[i];
                index++;
            }
        }

        return result;
    }
}

/*
Enter a string: this is a string example
Character frequencies:
t -> 2
h -> 1
i -> 3
s -> 3
  -> 4
a -> 2
r -> 1
n -> 1
g -> 1
e -> 2
x -> 1
m -> 1
p -> 1
l -> 1

*/
