import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt user to enter the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call method to remove the character from the string
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Display the modified string
        System.out.println("Modified String: \"" + modifiedString + "\"");

        // Close the scanner
        scanner.close();
    }

   
    // Method to remove all occurrences of a specified character from a string
    public static String removeCharacter(String str, char ch) {
        // Use StringBuilder to efficiently modify the string
        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (char currentChar : str.toCharArray()) {
            // Append character to result if it is not the character to remove
            if (currentChar != ch) {
                result.append(currentChar);
            }
        }

        // Convert StringBuilder back to String and return
        return result.toString();
    }
}

/*
Enter a string: hello
Enter the character to remove: l
Modified String: "heo"
*/