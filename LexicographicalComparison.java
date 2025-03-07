import java.util.Scanner;

public class LexicographicalComparison {
	
	// Method to compare which string is smaller in lexicographically order
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {	// first occurrence of mismatch
                return str1.charAt(i) - str2.charAt(i);	
            }
        }

        // If all characters are the same, compare lengths
        return len1 - len2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Take user input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

		// find the lexicographical order
        int result = compareStrings(str1, str2);
		
		// Display the result
        if (result < 0) {	// first string is smaller
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (result > 0) {	// second string is smaller
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {	// both strings are same
            System.out.println("Both strings are equal.");
        }
    }
}
/*
Enter first string: ameoba
Enter second string: amber
amber comes before ameoba in lexicographical order
*/