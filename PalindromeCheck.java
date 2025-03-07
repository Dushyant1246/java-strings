// class PalindromeCheck to check if string is palindrom using 3 logics
import java.util.Scanner;

public class PalindromeCheck {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert to lowercase and remove spaces (optional for uniformity)
        String formattedText = input.replaceAll("\\s+", "").toLowerCase();

        // Checking palindrome using all three methods
        boolean result1 = isPalindromeIterative(formattedText);
        boolean result2 = isPalindromeRecursive(formattedText, 0, formattedText.length() - 1);
        boolean result3 = isPalindromeUsingArray(formattedText);

        // Display results
        System.out.println("\nPalindrome check results:");
        System.out.println("Using Iterative Method: " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Method: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array: " + (result3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        // Reverse the original array
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

}

/*
Enter a string: abcdcba

Palindrome check results:
Using Iterative Method: Palindrome
Using Recursive Method: Palindrome
Using Character Array: Palindrome

*/