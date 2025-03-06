// VowelsConsonants class to count and display the number of vowels and consonants in a string
import java.util.Scanner;

class VowelsConsonants {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");	// this is a string
        String userInput = scanner.nextLine();

        // Counting vowels and consonants
        int[] result = countVowelsAndConsonants(userInput);

        // Displaying the results
        System.out.println("Number of Vowels: " + result[0]);	// 4
        System.out.println("Number of Consonants: " + result[1]);	// 9

        scanner.close(); // Closing the scanner object
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for uniformity
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a letter";
    }

    // Method to count vowels and consonants in a string using charAt()
    public static int[] countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        int length = 0;

        // Finding the length of the string without using length()
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when accessing an index out of range, stop counting
        }

        for (int i = 0; i < length; i++) {
            String type = checkCharacterType(input.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

}
