import java.util.Scanner;

public class SubstringCounter {
	// Method to find the count of substring
    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward to avoid overlapping counts
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Take user input
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();
        scanner.close();
        
		// calculate occurrences of substring
        int occurrences = countSubstringOccurrences(mainString, substring);
		
		// Display the result
        System.out.println("The substring appears " + occurrences + " times.");
    }
}
/*
Enter the main string: hello hello hi hi hello welcome
Enter the substring to count: hello
The substring appears 3 times.
*/