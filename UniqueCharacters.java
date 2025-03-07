// class UniqueCharacters to find and display unique letters in a string
import java.util.Scanner;

public class UniqueCharacters {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Displaying unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
    
    // Method to find the length of the string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') { 
                length++;
            }
        } catch (Exception e) {
            // When index goes out of bounds, stop counting
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length]; 
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in uniqueChars
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

        // Creating a new array with exact unique count
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }
}

/*
Enter a string: this is a sample string
Unique characters: t h i s   a m p l e r n g
*/