import java.util.Scanner;

public class PalindromeChecker {
	// Method to check if string is palindrom or not
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // If mismatch, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);

		// Display the result
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
/*
Enter a string: abcba
abcba is a palindrome.
*/