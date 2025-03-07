import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function and get results
        int[] result = countVowelsAndConsonants(input);		

        // Display the results
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        scanner.close();
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        text = text.toLowerCase(); // Convert to lowercase for easy comparison
        int vowelCount = 0, consonantCount = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it's a letter
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
		return new int[]{vowelCount, consonantCount};
    }
}

/*
Enter a string: this is a string
Number of Vowels: 4
Number of Consonants: 9
*/