import java.util.Scanner;

public class RemoveDuplicates {
	// Method to remove duplicate characters in string
    public static String removeDuplicateCharacters(String str) {
        boolean[] seen = new boolean[256];
        String result = "";
        
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result += ch;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
		
        // remove duplicates
        String modifiedString = removeDuplicateCharacters(input);
        
		// Display the result
		System.out.println("Modified string without duplicates: " + modifiedString);
    }
}
/*
Enter a string: this is a string
Modified string without duplicates: this arng
*/