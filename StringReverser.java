import java.util.Scanner;

public class StringReverser {
	// Method to reverse a string
    public static String reverseString(String text) {
        char[] chars = text.toCharArray();
        String result = "";

        for (int i = text.length() - 1 ; i >= 0 ; i--) {
			result += text.charAt(i);
		}

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
			
		// find the reversed string
        String reversed = reverseString(input);
	
		// Display the result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
/*
Enter a string: hello world!
Original String: hello world!
Reversed String: !dlrow olleh
*/